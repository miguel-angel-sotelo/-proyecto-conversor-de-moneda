import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consultar = new ConsultarMoneda();

        int opcion = 0;

        while (opcion != 7) {
            // Menú de opciones
            System.out.println(
                    "***********************************************\n" +
                    "Bienvenido/a a nuestro conversor de monedas :)\n"+
                    "***********************************************\n"+
                    "Elige una de nuestras opciones de conversion:\n"+
                    "1). Peso Mexicano =>> Dolar\n" +
                    "2). Dolar =>> Peso Mexicano1\n" +
                    "3). Real Brasileño =>> Dolar\n" +
                    "4). Dolar =>> Real Brasileño\n" +
                    "5). Dolar =>> Peso Colombiano\n" +
                    "6).Peso Colombiano  =>>Dolar \n" +
                    "7).Peso Argentino ==> Dolar\n"+
                    "8) Dolar ==> Peso Argentino\n"+

                    "9).Salir\n"+
                    "Elija una opción válida:\n" +
                    "____________________________________________________");

            // Leer la opción elegida
            opcion = Integer.parseInt(lectura.nextLine());

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("MXN", "USD", consultar, lectura);  // Peso Argentino a Dolar
                    break;
                case 2:
                    ConvertirMoneda.convertir("USD", "MXN", consultar, lectura);  // Dolar a Peso Argentino
                    break;
                case 3:
                    ConvertirMoneda.convertir("BRL", "USD", consultar, lectura);  // Real Brasileño a Dolar
                    break;
                case 4:
                    ConvertirMoneda.convertir("USD", "BRL", consultar, lectura);  // Dolar a Real Brasileño
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consultar, lectura);  // Dolar a Peso Colombiano
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consultar, lectura);  // Peso Colombiano a Dolar
                case 7:
                    ConvertirMoneda.convertir("ARS","USD",consultar,lectura); // peso
                    break;
                case 8:
                    ConvertirMoneda.convertir("ARS","USD",consultar,lectura);
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
