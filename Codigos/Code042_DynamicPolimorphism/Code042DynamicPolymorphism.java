package Codigos.Code042_DynamicPolimorphism;
import java.util.Scanner;;

public class Code042DynamicPolymorphism {

    //ex. A corvette is a: corvette, and car, an a vehicle, and a object

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("what animal do ou want ?");
        System.out.println("( 1 = dog) or ( 2 = cat)");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            animal.speak();
        }

        scanner.close();

    }
}
