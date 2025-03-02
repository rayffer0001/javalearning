package org.example.poo;

public class Constructores {

    //Permite inicializar los objetos al momento de crearlos
    //Por defecto, no tienen parametro
    //Parametros: permite asignar valores al momento de la creacion
    //Sobrecarga de constructores; permite definir multiple constructores de la misma clase, llamar el mismo metodo pero pasando diferentes atributos

    public static void main(String[] args) {
        Empleado empleado = new Empleado("rayffer", 400.0);
        empleado.mostrarEmpleado();

    }
}

class Empleado{
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    void mostrarEmpleado(){
        System.out.println("el nombre del empleado es: " + nombre + " y el salario es " + salario);
    }
}