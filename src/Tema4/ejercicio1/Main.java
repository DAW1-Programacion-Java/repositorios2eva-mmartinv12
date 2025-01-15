package Tema4.ejercicio1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //Instanciamos la clase creando varios objetos a cada clase (alumno).

        Alumno alumno1 = new Alumno(1234, "Gabriel", "Sastre", LocalDate.of(1998, 10, 30), "1ºDAW");
        Alumno alumno2 = new Alumno(5678, "Alex", "Morgan", LocalDate.of(17, 02, 13), "1ºDAW");
    }
}
