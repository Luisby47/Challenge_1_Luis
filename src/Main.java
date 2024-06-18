import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Consulta consulta = new Consulta();
        int opcion = 0;
        double monto = 0;
        Moneda moneda;
        Double conversionRate = 0.0;
        try {
            while (opcion != 7){
                System.out.println("**********************************************");
                System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
                System.out.println("**********************************************");
                System.out.println("1) Dólar => Peso argentino");
                System.out.println("2) Peso argentino => Dólar");
                System.out.println("3) Dólar => Real brasileño");
                System.out.println("4) Real brasileño => Dólar");
                System.out.println("5) Dólar => Peso colombiano");
                System.out.println("6) Peso colombiano => Dólar");
                System.out.println("7) Salir");
                System.out.println("Elija una opción válida:");
                System.out.println("**********************************************");
                Scanner teclado = new Scanner(System.in);
                opcion = teclado.nextInt();

                if (opcion != 7){
                    System.out.println("Ingrese el valor a convertir:");
                    monto = teclado.nextDouble();

                }

                switch (opcion){
                    case 1:
                        moneda = consulta.buscarMoneda("USD");
                        conversionRate= moneda.getConversionRates().get("ARS");
                        if (conversionRate != null) {
                            System.out.println("El valor de " + monto + "[USD] correponde al valor final de : " + monto * conversionRate + "[ARS]");
                        }
                        break;
                    case 2:
                        moneda = consulta.buscarMoneda("ARS");
                        conversionRate = moneda.getConversionRates().get("USD");
                        if (conversionRate != null) {
                            System.out.println("El valor de " + monto + "[ARS] correponde al valor final de : " + monto * conversionRate + "[USD]");
                        }

                        break;
                    case 3:
                        moneda = consulta.buscarMoneda("USD");
                        conversionRate = moneda.getConversionRates().get("BRL");
                        if (conversionRate != null) {
                            System.out.println("El valor de " + monto + "[USD] correponde al valor final de : " + monto * conversionRate + "[BRL]");
                        }

                        break;
                    case 4:
                        moneda = consulta.buscarMoneda("BRL");
                        conversionRate = moneda.getConversionRates().get("USD");
                        if (conversionRate != null) {
                            System.out.println("El valor de " + monto + "[BRL] correponde al valor final de : " + monto * conversionRate + "[USD]");
                        }
                        break;
                    case 5:
                        moneda = consulta.buscarMoneda("USD");
                        conversionRate = moneda.getConversionRates().get("COP");
                        if (conversionRate != null) {
                            System.out.println("El valor de " + monto + "[USD] correponde al valor final de : " + monto * conversionRate + "[COP]");
                        }
                        break;
                    case 6:
                        moneda = consulta.buscarMoneda("COP");
                        conversionRate = moneda.getConversionRates().get("USD");
                        if (conversionRate != null) {
                            System.out.println("El valor de " + monto + "[COP] correponde al valor final de : " + monto * conversionRate + "[USD]");
                        }
                        break;
                    case 7:
                        System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            }

        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}