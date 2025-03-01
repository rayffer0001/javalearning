package org.example.funciones;

import java.util.Scanner;

public class MenuCalculadora {

    protected static Scanner scanner = new Scanner(System.in);
    protected static char opcion;

    public static void main(String[] args) {

        do {
            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║          Menú de la Calculadora        ║");
            System.out.println("╠══════════════╦═════════════════════════╣");
            System.out.println("║ Opción       ║ Operación               ║");
            System.out.println("╠══════════════╬═════════════════════════╣");
            System.out.println("║ +            ║ Sumar                   ║");
            System.out.println("║ -            ║ Restar                  ║");
            System.out.println("║ *            ║ Multiplicar             ║");
            System.out.println("║ /            ║ Dividir                 ║");
            System.out.println("║ 0            ║ Salir                   ║");
            System.out.println("╠══════════════╬═════════════════════════╣");
            System.out.print("Elige una opción: ");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case '+':
                    System.out.println("El resultado de la suma es " + suma());
                    break;
                case '-':
                    System.out.println("El resultado de la resta es " + resta());
                    break;
                case '*':
                    System.out.println("El resultado de la multiplicacion es " + multiplicacion());
                    break;
                case '/':
                    System.out.println("El resultado de la division es " + division());
                    break;
                case '0':
                    opcion = 0;
                    break;
                default:
                    System.out.println("la opcion no es valida");
            }

        } while (opcion != 0);

    }

    private static int suma() {
        System.out.println("digite numero uno: ");
        int numero1 = scanner.nextInt();
        System.out.println("digite numero dos: ");
        int numero2 = scanner.nextInt();
        return numero1 + numero2;
    }

    private static int resta() {
        System.out.println("digite numero uno: ");
        int numero1 = scanner.nextInt();
        System.out.println("digite numero dos: ");
        int numero2 = scanner.nextInt();
        return numero1 - numero2;

    }

    private static int multiplicacion() {
        System.out.println("digite numero uno: ");
        int numero1 = scanner.nextInt();
        System.out.println("digite numero dos: ");
        int numero2 = scanner.nextInt();
        return numero1 * numero2;
    }

    private static double division() {
        System.out.println("digite numero uno: ");
        int numero1 = scanner.nextInt();
        System.out.println("digite numero dos: ");
        int numero2 = scanner.nextInt();
        return (double) numero1/numero2;
    }
}


