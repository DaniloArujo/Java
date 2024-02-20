package Codigos;

import java.util.ArrayList;

public class Code020_ForEach {
    public static void main(String[] args) {
        ArrayList<String> times = new ArrayList<>();
        times.add("Fluminense");
        times.add("Botafogo");
        times.add("Vasco");
        times.add("Flamengo");

        for(String i : times){
            System.out.println(i);
        }

        String[] animals = {"Cat","Dog","Bird"};
        
        for(String i : animals){
            System.out.println(i);
        }
    }
}
