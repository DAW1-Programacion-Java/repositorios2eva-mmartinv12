package Tema4.ejercicio3;

public class MainEjercicio3 {

    public static void main(String[] args) {

        double[] miCoordenada = {-6.4572000, 38.4447100};
        Taxi taxi1 = new Taxi("1234AAA", Distritos.SUR, TipoMotor.DIESEL, miCoordenada);
        Taxi taxi2 = new Taxi("5678BBB", Distritos.OESTE, TipoMotor.GASOLINA);

        //Imprimir todos los atributos:
        System.out.println(taxi1);
        System.out.println(taxi2);

        System.out.println(taxi1.operan_distrito(taxi2));
    }
}
