package alura.edu;

import alura.edu.model.CurrencyCode;
import alura.edu.service.Service;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();
        double response = 0;
        double value = 0;
        do {
            System.out.println("""
                -------------- Bienvenido al conversor de monedas --------------
                Creado por Erick Santamaria
                *Para el Challenge de Alura*
                
                Menú de opciones
                1) Dólar            -> Peso Argentino
                2) Peso Argentino   -> Dólar
                3) Real Brasileño   -> Dólar
                4) Dólar            -> Real Brasileño
                5) Dólar            -> Peso Colombiano
                6) Peso Colombiano  -> Dólar
                7) Salir
                
                Elige una opción válida:
                """);

            try{
                option = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("***El valor ingresado no es un número***\n\n");
                continue;
            }

            if (option == 7) {
                System.out.println("Gracias por usar mi programa 😍. Adios! ");
                break;
            } else if (option < 1 || option > 7 ) {
                System.out.println("Opción no válida. Intente de nuevo");
                continue;
            }

            System.out.println("Ingrese el valor del dinero que desea intercambiar: ");

            try{
                value = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("***El valor ingresado no es un número***\n\n");
                continue;
            }


            String strCurrency = "";

            String responseString = "El cambio a la moneda es de: ";

            switch (option) {
                case 1:
                    response = service.exchangeCurrency(String.valueOf(CurrencyCode.USD),String.valueOf(CurrencyCode.ARS),value).getConversion_result();
                    strCurrency = String.valueOf(CurrencyCode.ARS);
                    break;
                case 2:
                    response = service.exchangeCurrency(String.valueOf(CurrencyCode.ARS),String.valueOf(CurrencyCode.USD),value).getConversion_result();
                    strCurrency = String.valueOf(CurrencyCode.USD);
                    break;
                case 3:
                    response = service.exchangeCurrency(String.valueOf(CurrencyCode.BRL),String.valueOf(CurrencyCode.USD),value).getConversion_result();
                    strCurrency = String.valueOf(CurrencyCode.USD);
                    break;
                case 4:
                    response = service.exchangeCurrency(String.valueOf(CurrencyCode.USD),String.valueOf(CurrencyCode.BRL),value).getConversion_result();
                    strCurrency = String.valueOf(CurrencyCode.BRL);
                    break;
                case 5:
                    response = service.exchangeCurrency(String.valueOf(CurrencyCode.USD),String.valueOf(CurrencyCode.COP),value).getConversion_result();
                    strCurrency = String.valueOf(CurrencyCode.COP);
                    break;
                case 6:
                    response = service.exchangeCurrency(String.valueOf(CurrencyCode.COP),String.valueOf(CurrencyCode.USD),value).getConversion_result();
                    strCurrency = String.valueOf(CurrencyCode.USD);
                    break;
                default:
                    responseString = "";
                    break;
            }

            System.out.println(responseString + response + " " + strCurrency + "\n\n\n");

        }while(true);

    }
}