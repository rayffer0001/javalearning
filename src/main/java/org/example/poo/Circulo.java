package org.example.poo;

public class Circulo extends Figura {

    double radio = 10;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    void calcularArea() {
        System.out.println("el area es: " + (Math.PI * radio * radio));

    }
}

abstract class Figura{
    abstract void calcularArea();
}