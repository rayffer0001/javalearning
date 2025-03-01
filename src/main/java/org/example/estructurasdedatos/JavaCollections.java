package org.example.estructurasdedatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaCollections {

    public static void main(String[] args) {

        //Interfaces: List, Set, Queue, Map
        //Implementaciones List: ArrayList, Linkedlist
        //Implementaciones Set: Hashset, TreeSet
        //Implementaciones Queue: PriorityQueue, Deque
        //Implementaciones Queue: HashMap, TreeMap, LinkedHashMap
        agregarEliminarModificar();
        System.out.println();
        ordenamientoYBusqueda();
        System.out.println();
        stringYLambda();

    }

    public static void agregarEliminarModificar() {
        List<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        lista.remove("a");
        System.out.println("tamaño: " + lista.size());
    }

    public static void ordenamientoYBusqueda() {
        List<Integer> numeros = Arrays.asList(3, 1, 5, 9);
        Collections.sort(numeros);
        System.out.println(numeros);
    }

    public static void stringYLambda(){
        List<String> listaNombres = Arrays.asList("Ana", "Pedro", "Papi");
        listaNombres.stream().filter(n->n.startsWith("P")).forEach(System.out::println);
    }

}
