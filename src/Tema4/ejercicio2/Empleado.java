package Tema4.ejercicio2;
/* Diseña una clase llamada Empleado con las características que se citan a
continuación. Prueba sus métodos.
a. Atributos: id, nombre, apellidos, salario mensual.
b. Métodos: constructor, getters y setters.
c. Añade los métodos:
i. getNombreCompleto. Devuelve el nombre del empleado con la
forma: Apellidos, Nombre.
ii. getSalarioAnual. Este se obtiene multiplicando por doce el
salario mensual.
iii. incrementaSalario (int porcentaje). Incrementa el salario en el
porcentaje indicado.
iv. toString.
d. Crea dos empleados y prueba los métodos programados, incrementa
su salario y obtén el salario anual. */
public class Empleado {

    //Definir atributos:
    private int id;
    private String nombre;
    private String apellidos;
    private double salario_mensual;

    //Constructor:
    public Empleado (int id, String nombre, String apellidos, double salario_mensual) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario_mensual = salario_mensual;
    }

    //Getters and setters:
    public int getId() {
        return id;
    }
    public void setId (int id) {
        this.id = id;
    }
    public String getNombre () {
        return nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos () {
        return apellidos;
    }
    public void setApellidos (String apellidos) {
        this.apellidos = apellidos;
    }
    public double getSalario_mensual () {
        return salario_mensual;
    }
    public void setSalario_mensual (double salario_mensual) {
        this.salario_mensual = salario_mensual;
    }

    //Métodos:
    public String getNombreCompleto () {
        return apellidos + " " + nombre;
    }
    public double getSalarioAnual () {
        return this.salario_mensual * 12;
    }
    public void incrementaSalario (double porcentaje) {
        this.salario_mensual = salario_mensual * (1+(porcentaje/100));
        //this.salario_mensual = salario_mensual + salario_mensual * (porcentaje/100);
        //Se divide el porcentaje entre 100 para convertirlo en un número decimal.
        //Se suma 1 a ese valor decimal para calcular el multiplicador.
    }

    @Override
    public String toString () {
        return id + " " + nombre + " " + apellidos + " " + salario_mensual;
    }
}
