package Codigos.Code041_StaticKeyword;

public class Code041_StaticKeyword {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        System.out.println(Friend.numberOfFriends);
        System.out.println(friend1.name);
        System.out.println(friend2.name);
    }
}
