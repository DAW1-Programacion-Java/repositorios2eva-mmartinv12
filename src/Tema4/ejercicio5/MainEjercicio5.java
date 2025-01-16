package Tema4.ejercicio5;

import java.time.LocalDate;

public class MainEjercicio5 {

    public static void main(String[] args) {

        Ejercicio5 alumno1 = new Ejercicio5(1234, "Pepe", "Martin",
                LocalDate.of(1998, 12, 30), "1ºDAW", 8.7, 7.5);

        Ejercicio5 alumno2 = new Ejercicio5(5678, "Paco", "Martin",
                LocalDate.of(1997, 9, 17), "1ºDAW", 9.2, 9.7);

        System.out.println("Nota media de Pepe: " + alumno1.calculaMedia());
        System.out.println("Nota media de Paco: " + alumno2.calculaMedia());

        System.out.println(alumno1);
        System.out.println(alumno2);
    }
}
