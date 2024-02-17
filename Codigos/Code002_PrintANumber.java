package Codigos;
import java.util.Scanner;

public class Code002_PrintANumber {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("What is your name?");
      String name = scanner.nextLine();

      System.out.println("What is your favorite food? ");
      String food = scanner.nextLine();

      System.out.println("What is your age? ");
      int age = scanner.nextInt();
      scanner.nextLine();
      
      System.out.println("Hello "+name);
      System.out.println("Yout favorite food is: "+food);
      System.out.println("You are age is: "+ age);
      scanner.close();
   }
}