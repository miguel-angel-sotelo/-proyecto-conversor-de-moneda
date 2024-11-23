import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        // Consultar las tasas de conversión
        Moneda monedas = consulta.buscarMonedas(monedaBase);

        // Obtener la tasa de conversión de la moneda base a la moneda destino
        Double tasaConversion = monedas.getConversionRate(monedaTarget);
        if (tasaConversion != null) {
            System.out.println("La tasa de conversión de " + monedaBase + " a " + monedaTarget + " es: " + tasaConversion);
            System.out.println("Ingrese la cantidad de " + monedaBase + ": ");
            double cantidad = Double.parseDouble(lectura.nextLine());

            // Realizar la conversión
            double cantidadConvertida = cantidad * tasaConversion;
            System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedaTarget);
        } else {
            System.out.println("La tasa de conversión para " + monedaTarget + " no está disponible.");
        }
    }
}

