package Codigos.Code029_ToStringMethod;

public class Car {
    String name = "Camaro";
    int year = 2023;

    @Override
    public String toString() {
       String myString = name+"\n"+year;
        return myString;
    }
}
