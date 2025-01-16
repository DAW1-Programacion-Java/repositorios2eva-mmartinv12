package Tema4.ejercicio4;
/* Diseña un programa Java que trabaje con una clase llamada DvdCine.
a. Su atributos serán: título, director, productora, actores principales,
género, resumen y duración.
b. Debe incluir un constructor que reciba como parámetros los atributos.
c. Crea un método llamado esThriller que devuelva true o false según la
película sea o no de este género.
d. Crea todos los métodos gets/sets.
e. Crea un método llamado mismaProductora que reciba un objeto de la
clase DvdCine como parámetro. Este método devuelve true o false si
el objeto utilizado con el método es de la misma productora que el
pasado como parámetro.
f. Crea objetos y prueba estos métodos. */

import java.util.ArrayList;
import java.util.Objects;

public class DvdCine {

    private String titulo;
    private String director;
    private String productora;
    private ArrayList<String> actores = new ArrayList<String>();
    private Generos genero;
    private String resumen;
    private int duracion;

    //CONSTRUCTOR:
    public DvdCine(String titulo, String director, String productora, ArrayList<String> actores,
                   Generos genero, int duracion) {

        this.titulo = titulo;
        this.director = director;
        this.productora = productora;
        this.actores = actores;
        this.genero = genero;
        this.resumen = resumen;
        this.duracion = duracion;
    }

    //Metodo esThriller que devuelva true o false segun la pelicula sea o no de ese genero:
    public boolean esThriller() {
        return Generos.THRILLER.equals(this.genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //Metodo mismaProductora que devuelve true o false:
    public boolean mismaProductora(DvdCine otroCine) {
        return this.productora.equals(otroCine.getProductora()); //Compara las productoras de ambos objetos.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DvdCine dvdCine = (DvdCine) o;
        return Objects.equals(titulo, dvdCine.titulo) && Objects.equals(director, dvdCine.director);
    }

    @Override
    public int hashCode() { //El codigo hash lo genera con el titulo y el director
        return Objects.hash(titulo, director);
    }

    @Override
    public String toString() {
        return "DvdCine{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", productora='" + productora + '\'' +
                ", actores=" + actores +
                ", genero=" + genero +
                ", resumen='" + resumen + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
