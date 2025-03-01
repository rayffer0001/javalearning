package org.example.operadores;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Ingresar dos numeros y compararlos si son mayor o menor o iguales

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero 1 ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese numero 2 ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("el numero " + numero1 + " es mayor ");
        }else if(numero1 < numero2){
            System.out.println("el numero " + numero1 + " es menor ");
        }else {
            System.out.println("los numeros son iguales");
        }






    }

}
