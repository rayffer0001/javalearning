package org.example.poo;

public class Encapsulamiento {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Rayffer");
        System.out.println("el nombre es: " + persona.getNombre());
    }
}

class Persona{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
