package Codigos;

public class Code021_Methods {
    public static void main(String[] args) {
        String name = "Danilo";
        int age = 21;
        hello(name, age);
        hello("Eduardo",2);
        hello("Matheus",20);
        hello("Jorge",22);
    }

    static void hello(String name, int age){
        System.out.println("Hello "+name+ ". you are "+age+" years old");
        System.out.println();
    }
}
