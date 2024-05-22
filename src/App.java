import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner valor = new Scanner(System.in);
        int Dolar = 1;
        double PesoArgentino = 889.5;
        double Real = 5.15;
        double PesoColombiano = 3826.8;
        int condicion = 1;
        double cantidad;

        while (condicion==1) {
            System.out.println("");
        System.out.println("******************************************");
        System.out.println("Sea Bienvenido/a al Conversor de Moneda =]");
        System.out.println("");
        System.out.println("1) Dolar =>> Peso Argentino");
        System.out.println("2) Peso Argentino =>> Dolar");
        System.out.println("3) Dolar =>> Real Brasileño");
        System.out.println("4) Real Brasileño =>> Dolar");
        System.out.println("5) Dolar =>> Peso Colombiano");
        System.out.println("6) Peso Colombiano =>> Dolar");
        System.out.println("7) Salir");
        System.out.println("Elige una opción valida");
        System.out.println("******************************************");
        int opcion = valor.nextInt();
        
        switch (opcion) {
            case 1:
            System.out.println("Ingrese el valor a convertir= ");
            cantidad = valor.nextDouble();
            System.out.println("El valor "+cantidad+" [USD] corresponden al valor final de =>> "+cantidad*PesoArgentino+" [ARS]");
                break;
            case 2:
            System.out.println("Ingrese el valor a convertir= ");
            cantidad = valor.nextDouble();
            System.out.println("El valor "+cantidad+" [ARG] corresponden al valor final de =>> "+cantidad*(Dolar/PesoArgentino)+" [USD]");
                break;
            case 3:
            System.out.println("Ingrese el valor a convertir= ");
            cantidad = valor.nextDouble();
            System.out.println("El valor "+cantidad+" [USD] corresponden al valor final de =>> "+cantidad*Real+" [BRS]");
                break;
            case 4:
            System.out.println("Ingrese el valor a convertir= ");
            cantidad = valor.nextDouble();
            System.out.println("El valor "+cantidad+" [BRS] corresponden al valor final de =>> "+cantidad*(Dolar/Real)+" [BRS]");
                break;
            case 5:
             System.out.println("Ingrese el valor a convertir= ");
             cantidad = valor.nextDouble();
             System.out.println("El valor "+cantidad+" [USD] corresponden al valor final de =>> "+cantidad*PesoColombiano+" [COL]");
                break;
            case 6:
             System.out.println("Ingrese el valor a convertir= ");
            cantidad = valor.nextDouble();
             System.out.println("El valor "+cantidad+" [COL] corresponden al valor final de =>> "+cantidad*(Dolar/PesoColombiano)+" [USD]");
                    break;
            default:
                condicion=0;
                break;
        }
    }
    }
   
}
