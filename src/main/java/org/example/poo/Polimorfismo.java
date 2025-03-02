package org.example.poo;

public class Polimorfismo {

    //permite que un mismo metodo se comporte de diferentes formas segun el objeto que lo use o context que sea usado
    // Sobreescritura: (@Override) redefine un metodo heredado de la clase padre
    // Sobrecarga: Crear multiple versiones de un metodo con diferentes parametros

    public static void main(String[] args) {
        Vehiculo vehiculo = new Moto(); //Sobreescritura
        Vehiculo bote = new Lancha(); //Sobrecarga
        vehiculo.accelerar();
        bote.accelerar();
    }

}


class Vehiculo{
    void accelerar(){
        System.out.println("el vehiculo esta acelerando");
    }
}

class Moto extends Vehiculo{
    @Override
    void accelerar(){
        System.out.println("la moto acelera rapidamente");
    }
}

class Lancha extends Vehiculo{ //clase hija
    void accelerar(){
        System.out.println("La lancha navega");
    }
}