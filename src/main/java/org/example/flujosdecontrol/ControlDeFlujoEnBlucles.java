package org.example.flujosdecontrol;

public class ControlDeFlujoEnBlucles {

    public static void main(String[] args) {

        System.out.println("Ejemplo con break");
        for (int i = 0; i < 11; i++) {
            if (i == 5){
                break;
            }
            System.out.println(i);
        }

        //Ejemplo continue, no se ejecuta la clausula de la condicion del continue, no imprime el "5"
        System.out.println("Ejemplo con Continue");
        for (int i = 0; i < 11; i++) {
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }




    }

}
