package org.example.arrays;

import java.util.Scanner;

public class EjercicioPracticoArrays {

    public static void main(String[] args) {

        //pedir al usuario 5 numeros y almacenarlo en el array y luego recorrer el array y encontrar el numero mayor

        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];
        int mayor = 0;

        System.out.println("Ingrese 5 numeros: ");

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite el numero " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();

        }

        for (int i = 0; i < valores.length; i++){
            if (valores[i] > mayor ){
                mayor = valores[i];

            }
        }
        System.out.println(valores);
        System.out.println("el numero mayor es: " + mayor);
    }

}

