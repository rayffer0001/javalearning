package org.example.poo;

public class Clases {

    //POO: Paradigma de programacion que organiza el codigo en objetos los cuales representan entidades del mundo real

    //Atributo: propiedades de un objeto, son las variables de la clase
    //Objeto: instancia de la clase con sus propios valores y comportamientos
    //Metodos: Funciones que definen el comportamiento del un objeto
    //Clase: Modelo o plantilla a partir creamos objetos

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "BMW";
        coche.modelo = "Z4";
        coche.año = 2000;
        coche.mostrarInfo();

    }

}

class Coche {
    String marca;
    String modelo;
    int año;

    void mostrarInfo (){
        System.out.println("la marca es: " + marca + ", el modelo es: " + modelo + " y el año es: " + año);
    }
}