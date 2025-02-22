package org.example;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Determinar si un numero es par/2 or impar!2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("el numero " + numero + " es par");
        }else {
            System.out.println("el numero " + numero + " es impar");
        }



    }

}
