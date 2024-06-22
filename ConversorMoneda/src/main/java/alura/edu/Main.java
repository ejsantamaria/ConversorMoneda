package alura.edu;

import alura.edu.model.CurrencyCode;
import alura.edu.service.Service;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        ArrayList<String> history = new ArrayList<String>();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
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
                7) Peso Mexicano    -> Dólar
                8) Dólar            -> Peso Mexicano
                9) Dólar            -> Bolivian Boliviano
                10) Ver registros de conversiones realizadas
                11) Salir
                
                Elige una opción válida:
                """);

            try{
                option = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("***El valor ingresado no es un número***\n\n");
                continue;
            }

            if (option == 11) {
                System.out.println("Gracias por usar mi programa 😍. Adios! ");
                break;
            } else if (option == 10) {
                System.out.println(history);
                continue;
            }
            else if (option < 1 || option > 11 ) {
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
                case 7:
                    response = service.exchangeCurrency(String.valueOf(CurrencyCode.MXN),String.valueOf(CurrencyCode.USD),value).getConversion_result();
                    strCurrency = String.valueOf(CurrencyCode.USD);
                    break;
                case 8:
                    response = service.exchangeCurrency(String.valueOf(CurrencyCode.USD),String.valueOf(CurrencyCode.MXN),value).getConversion_result();
                    strCurrency = String.valueOf(CurrencyCode.MXN);
                    break;
                case 9:
                    response = service.exchangeCurrency(String.valueOf(CurrencyCode.USD),String.valueOf(CurrencyCode.BOB),value).getConversion_result();
                    strCurrency = String.valueOf(CurrencyCode.BOB);
                    break;
                default:
                    responseString = "";
                    break;
            }


            Date date = new Date();
            history.add("Conversión realizada la fecha: " + dateFormat.format(date) + "\n Descripción: " + responseString + response + " " + strCurrency);
            System.out.println(responseString + response + " " + strCurrency + "\n\n\n");

        }while(true);

    }
}