package Codigos;
import java.util.Scanner;

public class Code013_NestedLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
     

        System.out.println("Entre com o numero de colunas: ");
        rows = scanner.nextInt(); scanner.nextLine();

        for(int i = 1; i <= rows + 1; i++ ){
            System.out.println();
            for(int j = 1; j < i; j++){
                System.out.print("*");
            }
        }
        scanner.close();
    }
}
