package org.example.estructurasdedatos;

import java.util.LinkedList;
import java.util.Queue;

public class Colas {

    public static void main(String[] args) {

        //first In/first Out (FIFO)
        Queue<String> colas = new LinkedList<>();
        colas.add("a");
        colas.add("b");
        colas.add("c");
        System.out.println(colas.poll());
        System.out.println(colas);

    }

}
