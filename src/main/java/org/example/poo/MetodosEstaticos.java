package org.example.poo;

public class MetodosEstaticos {

    public static void main(String[] args) {
        System.out.println(Calculadora.suma(3, 4));

    }
}

class Calculadora{
    static int suma(int a, int b){
        return a + b;
    }
}
