package org.example.flujosdecontrol;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        //if else y el switch.
        /*
        * Crea un programa que pida al usuario ingresar una calificacion numerica que puede ser de (0 a 100)
        * que devuelva la nota correspondiente segun la siguiente escala
        * 90-100 → "Aprobado con Excelente"
        80-89 → "Aprobado con Bueno"
        70-79 → "Aprobado con Regular"
        Menos de 70 → "Reprobado"
        🔹 Usa if-else para evaluar la calificación.
        🔹 Usa switch para imprimir un mensaje adicional según el último dígito de la calificación:

        0-3: "Necesitas mejorar"
        4-7: "Buen desempeño"
        8-9: "Casi perfecto"
        💡 Pista: Usa cal
        Pista: Usa calificacion % 10 para obtener el último dígito.
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero de 0 a 100: ");
        int calificacion = scanner.nextInt();

        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Calificacion debe entre 0 a 100");
        } else if (calificacion >= 90) {
            System.out.println("Aprobado con Excelente");
        } else if (calificacion >= 80) {
            System.out.println("Aprobado con Bueno");
        } else if (calificacion >= 70) {
            System.out.println("Aprobado con Regular");
        } else {
            System.out.println("reprobado");
        }

        int ultimoDigito = calificacion % 10;
        switch (ultimoDigito) {
            case 0, 1, 2, 3:
                System.out.println("Necesitas mejorar");
                break;
            case 4, 5, 6, 7:
                System.out.println("Buen desempeño");
                break;
            case 8, 9:
                System.out.println("Casi perfecto");
                break;


        }
        scanner.close();
    }

}