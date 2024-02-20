package Codigos.Code025_OOP;


public class Code026_OOP {
    public static void main(String[] args) {
        //object = an instance of a class that contain attributes and methods
        // example: (phone, desk computer, coffe cup)
        
        Car mycar = new Car();
        Car mysecondCar = new Car();

        System.out.println(mycar.model);
        System.out.println(mycar.color);
        System.out.println(mycar.make);
        System.out.println(mycar.year);

        mycar.drive();
        mycar.brake();
        mysecondCar.drive();
    }
}
