package org.example.estructurasdedatos;

import java.util.LinkedList;

public class ListasEnlazadas {

    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<>(); // estructura de datos de dinamica(en tamaño)
        lista.add(6);
        lista.add(Integer.valueOf("2"));
        System.out.println(lista.get(1));

    }

}
