import java.util.Scanner;


public class Code002_PrintANumber {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("o numero inserido foi: " + number);
   } 
}
