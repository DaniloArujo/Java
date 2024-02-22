package Codigos.RPG;

public class Main {
    public static void main(String[] args) {
        
        //Criação de raças
        Race human = new Race("Human", 10, 5);
        Race elf = new Race("Elf", 5, 10);

        //Criação de classes
        Class warrior = new Class("Warrior", 50, 20);
        Class mage = new Class("Mage", 30, 30);

        //characters
        Character player1 = new Character("Thrall", human, warrior);
        Character player2 = new Character("Mediv", elf, mage);

        player1.displayInfo();
        System.out.println("-------------------");
        player2.displayInfo();
    }
}
