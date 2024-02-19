package Codigos;

import java.util.ArrayList;

public class Code018_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> time = new ArrayList<String>();
        time.add("Fluminense");
        time.add("Botafogo");
        time.add("Vasco");
        time.add("Flamengo");
        time.add("Bahia");


        for(int i = 0; i < time.size(); i++){
            System.out.println(time.get(i));
        }

        // set() = substituium item
        time.set(4, "vitória");

        //remove um item
        time.remove(3);

        //clear apaga todos os itens da lista
        time.clear();

        for(int i = 0; i < time.size(); i++){
            System.out.println(time.get(i));
        }

    }
}
