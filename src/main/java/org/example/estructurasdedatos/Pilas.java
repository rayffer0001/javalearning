package org.example.estructurasdedatos;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {

        Stack<Integer> pilas = new Stack<>(); // Last in/first out (LIFO)
        pilas.push(5);
        pilas.push(10);
        pilas.push(8);
        System.out.println(pilas.pop()); //elimina el ultimo digito entrado
        System.out.println(pilas.peek()); // Muestra el ultimo dijito entrado
        System.out.println(pilas);
    }

}
