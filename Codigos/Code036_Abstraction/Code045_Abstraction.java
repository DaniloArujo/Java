package Codigos.Code036_Abstraction;

public class Code045_Abstraction {
    public static void main(String[] args) {
        //Abstract Classes Cannot be instantiated, but they can have a subclass
        // abstract methods are declared without implementation.

        Car car = new Car();
        //Vehicle vehicle = new Vehicle();
        car.go();
    }
}
