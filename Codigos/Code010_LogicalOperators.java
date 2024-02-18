package Codigos;
import java.util.Scanner;
import java.util.Random;

public class Code010_LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // && and
        // || or
        // ! not
        
        int graus = random.nextInt(40);


        if(graus > 30){
            System.out.println(graus);
            System.out.println("Its hot outside");
        }
        else if( graus <= 30 && graus >= 20){
            System.out.println(graus);
            System.out.println("Its warm outside");
        }else{
            System.out.println(graus);
            System.out.println("Its cold outside");
        }

        
        scanner.close();
    }
}
