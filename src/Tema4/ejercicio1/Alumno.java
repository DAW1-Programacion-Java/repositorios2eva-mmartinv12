package Tema4.ejercicio1;

import java.time.LocalDate;

/* Diseña un programa en Java que trabaje con una clase llamada Alumno. Serán
atributos del alumno su número de expediente, nombre, apellidos, fecha de nacimiento
y curso en el que se matricula. La clase debe incluir un constructor y los métodos get
y set correspondientes y toString. Instancia varios objetos de esta clase y prueba los
métodos creados. */
public class Alumno {

    //Definimos los atributos de la clase.
    private int nexp;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String curso;

    //Creamos el metodo constructor.
    public Alumno(int nexp, String nombre, String apellidos, LocalDate fechaNacimiento, String curso) {
        this.nexp = nexp;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.curso = curso;
    }

    //Metodos get y set.
    public int getNexp() {
        return getNexp();
    }

    public void setNexp(int nexp) {
        this.nexp = nexp;
    }

    public String getNombre() {
        return getNombre();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return getApellidos();
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return getFechaNacimiento();
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCurso() {
        return getCurso();
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Metodo toString para mostrar los detalles del Alumno.
    @Override
    public String toString() {
        return "Alumno{" +
                "numeroExpediente='" + nexp + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", curso='" + curso + '\'' +
                '}';
    }
}
