package Codigos.Code041_Polimorphism;

public class Code041_polomorphism {
    
    //polymorphism = the ability of an object to identify as more than one type
    
    public static void main(String[] args) {
        
        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();

        Vehicle[] racers = {car, bicycle, boat};
        
        for (Vehicle x : racers) {
            x.go();
        }
    }
}
