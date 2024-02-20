package Codigos;

public class Code023_OverloadMethods {
    public static void main(String[] args){
        System.out.println(add(2,3));
        System.out.println(add(2, 4, 8));
    }
    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }
}
