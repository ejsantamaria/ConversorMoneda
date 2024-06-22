
# Conversor de monedas

## Descripción

Este proyecto es un conversor de monedas desarrollado en Java 17 con el uso de Maven. Permite realizar cambios de divisas entre diferentes monedas, utilizando la API ExchangeRate-API. Por el momento, el conversor puede manejar conversiones entre las siguientes monedas:

- Dólar estadounidense (USD)
- Peso argentino (ARS)
- Peso colombiano (COP)
- Real brasileño (BRL)

La interfaz gráfica del programa se realiza a través de la consola, ofreciendo una experiencia simple e intuitiva para el usuario.

## Características

- Conversión entre múltiples monedas.
- Obtención de tasas de cambio actualizadas desde la API ExchangeRate-API.
- Interfaz de usuario en consola.

## Requisitos

- Java 17
- Maven

## Instalación

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/ejsantamaria/ConversorMoneda.git
   cd ConversorMoneda
   ```

## Uso


1. **Interacción con el programa:**

   El programa solicitará al usuario que ingrese la moneda de origen, la moneda de destino y la cantidad a convertir. Luego, mostrará el resultado de la conversión basado en las tasas de cambio obtenidas de la API ExchangeRate-API.

   Capturas de pantalla de la interfaz en consola:
   
   Pantalla inicial: 

   ![Captura 1](https://github.com/ejsantamaria/ConversorMoneda/blob/main/ConversorMoneda/assets/Screenshot%202024-06-21%20224937.png)

   Ejecución de conversiones de monedas:

   ![Captura 2](https://github.com/ejsantamaria/ConversorMoneda/blob/main/ConversorMoneda/assets/Screenshot%202024-06-21%20225023.png)

   Extras: 
   ![Captura 3](https://github.com/ejsantamaria/ConversorMoneda/blob/main/ConversorMoneda/assets/Screenshot%202024-06-21%20231628.png)
   

## Estructura del Proyecto

```plaintext
ConversorMoneda/
├── .idea/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── alura/
│   │   │       └── edu/
│   │   │           ├── model/
│   │   │           │   ├── ApiResponse.java
│   │   │           │   └── CurrencyCode.java
│   │   │           ├── service/
│   │   │           │   └── Service.java
│   │   │           └── Main.java
│   │   └── resources/
│   └── test/
│       └── java/
├── target/
├── .gitignore
└── pom.xml
```

## Contribuciones

Las contribuciones son bienvenidas. Por favor, haga un fork del repositorio y envíe un pull request con sus cambios.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulte el archivo LICENSE para más detalles.

## Contacto

Para preguntas o soporte, por favor contacte a [ejsantamaria.cu@gmail.com].
