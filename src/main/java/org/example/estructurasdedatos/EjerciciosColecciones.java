package org.example.estructurasdedatos;

import java.util.*;

public class EjerciciosColecciones {

    public static void main(String[] args) {

        /*
        Ejercicios:
        * 1. Implementar una pila utilizando ArrayList.

        2. Crear un HashMap que almacene nombres y edades.

        3. Filtrar una lista de números para mostrar solo los mayores de 10 usando Streams.
        *
        * */

        //Stack<Integer> pila = new ArrayList<>();

        //Ejercicio #2
        nombresEdades();
        System.out.println();
        //Ejercicio #3
        numerosMayores();


    }

    public static void nombresEdades() {
        Map<String, Integer> nombresEdades = new HashMap<>();
        nombresEdades.put("carlos", 27);
        nombresEdades.put("juan", 50);
        nombresEdades.put("pedro", 14);
        System.out.println(nombresEdades);
    }

    public static void numerosMayores() {
        List<Integer> numerosMayores = Arrays.asList(1, 2, 3, 4, 20, 30);
        numerosMayores.stream().filter(n -> n > 10).forEach(System.out::println);
    }
}
