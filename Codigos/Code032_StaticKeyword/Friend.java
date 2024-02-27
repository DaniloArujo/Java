package Codigos.Code032_StaticKeyword;

public class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends ++;
    }

    static void displayfriends(){
        System.out.println("You have "+ numberOfFriends+" friends");
    }
}
