package Codigos.Code030_ArrayOfObjects;

public class Code030_ArrayOfObjects {
    public static void main(String[] args) {
        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        
        Food food2 = new Food("HotDog");
        
        Food food3 = new Food("Hamburger");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        for(int i = 0; i < refrigerator.length; i++){
            System.out.println(refrigerator[i].name);
        }

    }
}
