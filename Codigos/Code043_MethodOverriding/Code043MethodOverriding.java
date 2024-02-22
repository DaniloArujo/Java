package Codigos.Code043_MethodOverriding;

public class Code043MethodOverriding {
    public static void main(String[] args) {
        //method overriding = é a declaração de um methodo em uma classe que já está presente em uma classe parente. Os filhos terão sua própria implementação.
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.speak();
        cat.speak();
    }
}
