package Codigos;

public class Code005_MathClass {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        //max = encontra o maior valor. O comando min obviamente mostra o menor valor
        System.out.println(Math.max(x, y));

        //abs = absolute number, módulo do numero.
        System.out.println(Math.abs(x) + " " + Math.abs(y));

        //sqrt = raiz quadrada
        System.out.println(Math.sqrt(x));

        //round = arredondar
        System.out.println(Math.round(y));
        
        System.out.println(Math.round(x));

        //ceil = arredondar sempre para cima
        
        System.out.println(Math.ceil(y));
        
        System.out.println(Math.ceil(x));

        //floor = arredondar para baixo
        
        System.out.println(Math.floor(y));
        
        System.out.println(Math.floor(x));

    }
}
