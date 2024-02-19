package Codigos;
import java.util.*;

public class Code019_2DArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> times = new ArrayList<>();

        ArrayList<String> cariocas = new ArrayList<>();
        cariocas.add("Fluminense");
        cariocas.add("Vasco");
        cariocas.add("Botafogo");
        cariocas.add("Flamengo");
        //System.out.println(cariocas.get(0));

        ArrayList<String> paulistas = new ArrayList<>();
        paulistas.add("Santos");
        paulistas.add("São paulo");
        paulistas.add("Corinthians");
        paulistas.add("Palmeiras");

        
        ArrayList<String> mineiros = new ArrayList<>();
        mineiros.add("Atlético MG");
        mineiros.add("Cruzeiro");

        times.add(cariocas);
        times.add(paulistas);
        times.add(mineiros);

        //System.out.println(times);
        
        System.out.println(times.get(2).get(0));
        System.out.println(times.get(0).get(0));
    }
}
