package Tema4.ejercicio3;
/* Diseña un programa Java que guarde información sobre los taxis de una compañía.
De cada taxi debe guardarse la matrícula, distrito en el que opera (sur, norte, oeste…),
tipo motor (diesel o gasolina) y coordenadas (latitud y longitud por separado) en las
que se ubica. Crea la clase necesaria y añade métodos get/set, dos constructores
(uno con todos los atributos y otro sin coordenadas (poner a 0). Diseña otro método
que servirá para comprobar si dos taxis operan en el mismo distrito devolviendo true
o false. Este método recibirá un taxi como parámetro. Añade un nuevo método que
devuelva un String con las coordenadas en conjunto. Crea dos objetos Taxi y prueba
sus métodos. */
public class Taxi {

    private String matricula;
    private Distritos distrito;
    private TipoMotor motor;
    private double[] coordenadas;

    //Constructores:
    public Taxi(String matricula, Distritos distrito, TipoMotor motor, double[] coordenadas) {
        this.matricula = matricula;
        this.distrito = distrito;
        this.motor = motor;
        this.coordenadas = coordenadas;
    }

    public Taxi(String matricula, Distritos distrito, TipoMotor motor) {
        this.matricula = matricula;
        this.distrito = distrito;
        this.motor = motor;
        //Hay que poner a 0 las coordenadas:
        this.coordenadas = new double[]{0.0, 0.0};
    }

    //Getters and setters:

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Distritos getDistrito() {
        return distrito;
    }

    public void setDistrito(Distritos distrito) {
        this.distrito = distrito;
    }

    public TipoMotor getMotor() {
        return motor;
    }

    public void setMotor(TipoMotor motor) {
        this.motor = motor;
    }

    public double[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(double[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    //Metodo que comprueba si dos taxis operan en el mismo distrito:
    public boolean operan_distrito(Taxi otro_taxi) {
        return this.distrito.equals(otro_taxi.getDistrito());
    }

    //Metodo que devuelve las coordenadas en conjunto:
    public String coordenadasToString() {
        return "Longitud: " + coordenadas[0] + ", Latitud: " + coordenadas[1];
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula
                + "\nDistrito: " + distrito
                + "\nMotor: " + motor
                + "\nCoordenadas: " + coordenadasToString();
    }
}
