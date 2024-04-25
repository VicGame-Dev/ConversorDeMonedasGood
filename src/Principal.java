import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int desdeMoneda;
        int haciaMoneda;
        String moneda1 = "";
        String moneda2 = "";
        double valorAConvertir;
        double resultado;

        System.out.println("*****************************************\n"+
                "Bienvenido al Conversor de Monedas de VicGame-Dev\n" +
                "\n" +
                "Elija DESDE que moneda quieres convertir:\n" +
                "1) Dolar\n" +
                "2) Peso Argentino\n" +
                "3) Real Brasileño\n" +
                "4) Peso Colombiano\n" +
                "5) Euro\n" +
                "6) Peso Mexicano\n" +
                "7) salir\n" +
                "**********************************************");

        Scanner desdeTeclado = new Scanner(System.in);
        desdeMoneda = desdeTeclado.nextInt();

        switch (desdeMoneda) {
            case 1: moneda1 = "USD";
                System.out.println(moneda1);
                break;
            case 2: moneda1 = "ARS";
                System.out.println(moneda1);
                break;
            case 3: moneda1 = "BRL";
                System.out.println(moneda1);
                break;
            case 4: moneda1 = "COP";
                System.out.println(moneda1);
                break;
            case 5: moneda1 = "EUR";
                System.out.println(moneda1);
                break;
            case 6: moneda1 = "MXN";
                System.out.println(moneda1);
                break;
            case 7:
                System.out.println("Gracias por usar nuestros servicios\n"+
                        "Finalizó el programa");
                break;
            default: break;
        }


        System.out.println("*****************************************\n"+
                "Elija HACIA que moneda quieres convertir:\n" +
                "1) Dolar\n" +
                "2) Peso Argentino\n" +
                "3) Real Brasileño\n" +
                "4) Peso Colombiano\n" +
                "5) Euro\n" +
                "6) Peso Mexicano\n" +
                "7) salir\n" +
                "**********************************************");

        Scanner haciaTeclado = new Scanner(System.in);
        haciaMoneda = haciaTeclado.nextInt();

        switch (haciaMoneda) {
            case 1: moneda2 = "USD";
                System.out.println(moneda2);
                break;
            case 2: moneda2 = "ARS";
                System.out.println(moneda2);
                break;
            case 3: moneda2 = "BRL";
                System.out.println(moneda2);
                break;
            case 4: moneda2 = "COP";
                System.out.println(moneda2);
                break;
            case 5: moneda2 = "EUR";
                System.out.println(moneda2);
                break;
            case 6: moneda2 = "MXN";
                System.out.println(moneda2);
                break;
            case 7:
                System.out.println("Gracias por usar nuestros servicios\n"+
                        "Finalizó el programa");
                break;
            default: break;
        }

        System.out.println("¿Cuantos "+moneda1+" desea convertir a "+
                moneda2+"?");

        Scanner valorAConvertirTeclado = new Scanner(System.in);
        valorAConvertir = valorAConvertirTeclado.nextDouble();

        ConsultaMoneda consulta = new ConsultaMoneda();
        TasaDeCambio tasaDeCambio = consulta.buscaMoneda(moneda1, moneda2);

        /* System.out.println(tasaDeCambio); ESTA ES UNA LINEA DE CODIGO DE PRUEBA,
         PARA VER QUE Y COMO ME ENTREGRA EL RECORD */

        resultado = tasaDeCambio.conversion_rate()*valorAConvertir;

        System.out.println(valorAConvertir+moneda1+" equivale a "+
                resultado+" de "+moneda2);
    }
}