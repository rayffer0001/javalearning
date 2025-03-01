package org.example.operadores;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Hacer calculadora, recibe 3 datos, los dos numeros y la operacion

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero 1 ");
        double numero1 = scanner.nextInt();

        System.out.println("Ingrese numero 2 ");
        double numero2 = scanner.nextInt();

        System.out.println("Ingrese un operador: +, -, *, / ");
        char operacion = scanner.next().charAt(0);

        double resultado;

        switch (operacion) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("el resultado es: " + resultado );
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("el resultado es: " + resultado );
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("el resultado es: " + resultado );
                break;
            case '/':
                resultado = numero1 / numero2;
                System.out.println("el resultado es: " + resultado );
                break;
        }


    }
}
