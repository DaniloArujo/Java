package Codigos.Code040_Interface;

public class Code040_Interface {
    //interface = um template que pode ser aplicado a uma classe;
    //similar a herança, porêm especifica o que a classe precisa ter
    //classes podem aplicar mais de uma interface, herança é limitada a 1 super
    public static void main(String[] args) {
        //Rabbit rabbit = new Rabbit();
        //rabbit.flee();

        //Hawk hawk = new Hawk();
        //hawk.hunt();

        Fish fish = new Fish();

        fish.flee();
        fish.hunt();
    }
}
