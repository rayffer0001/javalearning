package org.example.poo;

public class Herencia {

    //extends
    //Clase padre: define los atributos y metodos comunes
    //Clase hija: hereda de la clase padre y puede agregar nuevas funcionalidades

    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.hacerSonido(); //sobrecarga

    }
}

class Animal{ //super clase
    void hacerSonido(){
        System.out.println("el animal hace un sonido");
    }
}

class Perro extends Animal{ //clase hija
    void hacerSonido(){
        System.out.println("el perro ladra");
    }
}

class Vaca extends Animal implements Bobino{ //clase hija
    void hacerSonido(){
        System.out.println("La vaca muuuuuuu");
    }

    @Override
    public void bramar() {
        System.out.println("la vaca brama");
    }

    @Override
    public void comer() {
        System.out.println("la vaca come");

    }
}