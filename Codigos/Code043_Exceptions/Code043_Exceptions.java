package Codigos.Code043_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Code043_Exceptions {

    //exception = an event thath occuors during the execution of a program that disrupts the normal flow of instructions.

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        try{
            

            System.out.println("Enter a whole numer to divide: ");
            int x = scanner.nextInt();

            
            System.out.println("Enter a second numer to divide: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println(z);

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(InputMismatchException b){
            System.out.println("Input error");
        }
        catch(Exception a){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("This is aways print");
            scanner.close();
        }
    }
}
