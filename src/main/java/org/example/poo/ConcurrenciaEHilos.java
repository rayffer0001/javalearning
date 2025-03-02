package org.example.poo;

public class ConcurrenciaEHilos {

    public static void main(String[] args) {
        MiHilo miHilo = new MiHilo();
        miHilo.setName("Hilo-1");
        MiHilo miHilo2 = new MiHilo();
        miHilo2.setName("Hilo-2");

        miHilo.start();
        miHilo2.start();
    }

}

class MiHilo extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - iteracion " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

