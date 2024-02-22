package Codigos.Code042_Inheritance;

public class Code042Inherithance {
    public static void main(String[] args) {
        // herança - Processo no qual uma classe adquire os atributos ou metodos de outra classe.

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        System.out.println(car.speed);
        System.out.println(bicycle.speed);

        car.stop();
        bicycle.stop();

        System.out.println(bicycle.pedals);

    }
}
