package org.example.estructurasdedatos;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {

        //Almacena un par de clave, valor -> se le asigna una clave personalizada

        Map<String, String> mapa = new HashMap<>();
        mapa.put("1", "uno");
        mapa.put("2", "dos");
        System.out.println(mapa.get("1"));

    }

}
