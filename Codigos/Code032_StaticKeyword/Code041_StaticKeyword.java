package Codigos.Code032_StaticKeyword;

public class Code041_StaticKeyword {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Sandy");
        System.out.println(Friend.numberOfFriends);
        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        
        Friend.displayfriends();

    }
}
