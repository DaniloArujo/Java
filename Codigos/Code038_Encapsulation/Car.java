package Codigos.Code038_Encapsulation;

public class Car {
    
    private String make;

    Car(String make){
        this.setMake(make);
    }

    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
}
