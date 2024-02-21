package Codigos.Code028_OverloadedConstructors;

public class Code028_OverloadConstructors {
    public static void main(String[] args) {
        // Overload constructors = Multiple constructors within a class with the same name,
        // but have diferent parameters
        // name + parameters = signature

        Pizza pizza = new Pizza("Thicc crust", "tomato","mozzarela","pepperini");

        System.out.println("Here are the ingredientes of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.tooping);

        Pizza pizza2 = new Pizza("thicc crust", "Tomato", "Mozzarela");
        pizza2.tooping = "pepperoni";
       
        System.out.println("Here are the ingredientes of your second pizza: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.tooping);
    }
}
