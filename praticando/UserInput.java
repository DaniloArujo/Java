package praticando;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com o seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Entre com sua idade: ");
        int age = scanner.nextInt(); scanner.nextLine();

        System.out.println("Olá "+name+", você tem "+age+" anos.");
    }
}