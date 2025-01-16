package Tema4.ejercicio5;
/* En un nuevo proyecto, copia la clase Alumno del ejercicio 1, y añade:
a. Dos atributos que guarden sendas notas (tipo double).
b. Crea los métodos get/set correspondientes, modifica también el
constructor para que incluya estas notas.
c. Crea un método que devuelva la media de las notas (double).
d. Crea un método que devuelva número de expediente, nombre y nota
media. */

import java.time.LocalDate;

public class Ejercicio5 {

    private int nexp;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String curso;
    private double nota1;
    private double nota2;

    public Ejercicio5(int nexp, String nombre, String apellidos, LocalDate fechaNacimiento,
                      String curso, double nota1, double nota2) {
        this.nexp = nexp;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getNexp() {
        return nexp;
    }

    public void setNexp(int nexp) {
        this.nexp = nexp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    //Metodo que devuelve la media de las notas:
    public double calculaMedia() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String toString() {
        return "Expediente: " + nexp + ", Nombre: " + nombre + ", Nota media: " + calculaMedia();
    }
}
