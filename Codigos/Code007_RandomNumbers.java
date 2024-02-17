package Codigos;
import java.util.Random;
import java.util.Random.*;

public class Code007_RandomNumbers {
    public static void main(String[] args) {
        Random random  = new Random();
        int x;
        do{
            x = random.nextInt(10)+1;
            System.out.println(x);
        }while(x != 10);
    }
}
