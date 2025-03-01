package org.example.funciones;

public class CalculadoraConFunciones {
    public static void main(String[] args) {

        System.out.println(suma(10,2));
        System.out.println(resta(10,2));
        System.out.println(multiplicacion(10,2));
        System.out.println(division(30,16));

    }

    private static int suma(int a, int b){ //metodo para sumar
        return a + b;
    }
    private static int resta(int a, int b){
        return a - b;
    }

    private static int multiplicacion(int a, int b){
        return a * b;
    }

    private static double division(int a, int b){
        return (double)a/b; //casteo de elementos
    }


}
