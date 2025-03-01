package org.example.flujosdecontrol;

public class ManejoDeExcepciones {

    public static void main(String[] args) {

        try {
            int x = 10/0;
        }catch(ArithmeticException e){
            System.out.println("error division por cero");

        }finally {
            System.out.println("este bloque siempre se va a ejecutar");

        }



    }


}
