package Tema4.ejercicio4;

import java.util.ArrayList;

public class MainEjercicio4 {

    public static void main(String[] args) {

        //Le damos valores al ArrayList de los actores:
        ArrayList<String> listaActores = new ArrayList<>();
        listaActores.add("Jennifer Lawrence");
        listaActores.add("Tom Hardy");
        listaActores.add("Florence Pugh");
        listaActores.add("Pedro Pascal");
        listaActores.add("Bill Skarsgård");

        //Instanciamos la clase DvdCine:
        DvdCine cine1 = new DvdCine("Venom", "Ruben Fleischer", "Marvel", listaActores,
                Generos.ACCION, 112);
        DvdCine cine2 = new DvdCine("Lady Macbeth", "William Oldroyd", "Sixty Six Pictures",
                listaActores, Generos.DRAMA, 89);

        System.out.println(cine1);
        System.out.println(cine2);

        //Probamos los métodos creados:
        if (cine1.esThriller()) {
            System.out.println("La película del cine1 es thriller");
        } else {
            System.out.println("La película del cine1 no es thriller");
        }

        if (cine1.mismaProductora(cine2)) {
            System.out.println("La película del cine1 es de la misma productora que la del cine2");
        } else {
            System.out.println("La película del cine1 no es de la misma productora que la del cine2");
        }

        //Por ejemplo quiero cambiar el nombre del director del cine2:
        cine2.setDirector("Scarlett Johansson");
        //Y ahora muestro el cambio:
        System.out.println(cine2.getDirector());
    }
}
