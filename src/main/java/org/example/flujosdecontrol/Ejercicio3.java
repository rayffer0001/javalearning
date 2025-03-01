package org.example.flujosdecontrol;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        /*
        * Enunciado:
        Crea un programa que solicite al usuario dos números enteros y realice una división.
        🔹 Usa try-catch para evitar errores si el usuario ingresa cero como divisor.
        🔹 Si ocurre un error, muestra un mensaje "No se puede dividir por cero" y vuelve a pedir los números.
        🔹 Usa un finally para mostrar "Operación finalizada" al terminar el cálculo.
        *
        * */

        Scanner scanner = new Scanner(System.in);
        boolean bandera = false;

        while (!bandera) {
            try {
                System.out.println("Ingrese numero 1 ");
                int numero1 = scanner.nextInt();
                System.out.println("Ingrese numero 2 ");
                int numero2 = scanner.nextInt();
                int resultado = numero1 / numero2;
                System.out.println("el resultado es " + resultado);
                bandera = true;
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por cero");
            } catch (Exception e) {
                System.out.println("entrada no valida");
                scanner.next();
            } finally {
                System.out.println("Operacion finalizada");
            }
        }
        scanner.close();
    }

}

