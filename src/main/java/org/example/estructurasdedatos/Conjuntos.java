package org.example.estructurasdedatos;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

    public static void main(String[] args) { // Lista de datos pero no permite elementos duplicados

        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("python");
        set.add("python");
        System.out.println("Contiene java " + set);

    }

}
