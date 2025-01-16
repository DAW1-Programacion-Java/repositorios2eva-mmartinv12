package Tema4.ejercicio2;

public class Main {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(1, "Pepe", "Garcia", 1000);
        Empleado empleado2 = new Empleado(2, "Paco", "Martin", 1500);

        System.out.println(empleado1);
        System.out.println(empleado2);

        System.out.println("Nombre completo empleado1: " + empleado1.getNombreCompleto());
        System.out.println("Nombre completo empleado2: " + empleado2.getNombreCompleto());

        System.out.println("Salario anual empleado1: " + empleado1.getSalarioAnual());
        System.out.println("Salario anual empleado2: " + empleado2.getSalarioAnual());

        //Incrementar el salario:
        empleado1.incrementaSalario(20);
        empleado2.incrementaSalario(30);
        System.out.println("Incremento del 20% salario mensual empleado1: " + empleado1.getSalario_mensual());
        System.out.println("Incremento del 30% salario mensual empleado2: " + empleado2.getSalario_mensual());
    }
}
