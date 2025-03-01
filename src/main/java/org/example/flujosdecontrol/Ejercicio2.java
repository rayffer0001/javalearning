package org.example.flujosdecontrol;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        /*
        *📌 Enunciado:
    Escribe un programa que muestre un menú interactivo con las siguientes opciones:
    Menú:
    1. Contar del 1 al 10 (usando for)
    2. Mostrar los números pares entre 1 y 20 (usando while)
    3. Pedir números al usuario hasta que ingrese 0 (usando do-while)
    4. Salir
    🔹 Usa un switch para manejar la opción ingresada por el usuario.
    🔹 Usa los bucles adecuados para cada tarea.
    🔹 La opción 4 debe terminar el programa.
        *
        *
        * */

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(" ");
            System.out.println("Selecciona una opcion");
            System.out.println("1. para Contar del 1 al 10 (usando for) ");
            System.out.println("2. para Mostrar los números pares entre 1 y 20 ");
            System.out.println("3. para Pedir números al usuario hasta que ingrese 0 ");
            System.out.println("4. para Salir ");
            System.out.println("Digite una opcion...");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Contando del 1 al 10");
                    for (int i = 1; i <= 10; i++) {
                        System.out.print(i + " ");
                    }
                    break;
                case 2:
                    System.out.println("Numeros pares de 1 a 20");
                    int i = 2;
                    while (i <= 20) {
                        System.out.print(i);
                        i += 2;
                    }
                    break;
                case 3:

                    System.out.println("Pedir números al usuario hasta que ingrese 0");

                    int numero;
                    do {
                        System.out.println("Ingrese un numero, o ingrese 0 para salir");
                        numero = scanner.nextInt();
                        if (numero != 0) {
                            System.out.println("ingresaste: " + numero);
                        }
                    } while (numero != 0);
                    break;
                case 4:
                    System.out.println("4");
                    break;
                default:
                    System.out.println("la opcion no es valida, intente de nuevo");
            }
        } while (opcion != 4);


    }
}
