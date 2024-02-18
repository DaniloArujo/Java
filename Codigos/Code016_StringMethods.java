package Codigos;

public class Code016_StringMethods {
    public static void main(String[] args) {
        String name = "Danilo";


        System.out.println("Lenght: "+name);

        //lenght
        System.out.println("Lenght: "+name.length());

        //equals = compara as astrings, retorna verdadeiro ou falso, case sensitive
        System.out.println("Lenght: "+name.equals("danilo"));
        
        //equalsIgnoreCase = compara as astrings, retorna verdadeiro ou falso, não é case sensitive
        System.out.println("Lenght: "+name.equalsIgnoreCase("danilo"));

        //charAt(0) = Retorna a letra no espaço selecionado
        System.out.println("Lenght: "+name.charAt(0));

        //indexof = retorna o caractere e retorna o index dele;
        System.out.println("Lenght: "+name.indexOf("n"));

        //isEmpty
        System.out.println("Lenght: "+name.isEmpty());

        //toUppercase
        System.out.println("Lenght: "+name.toUpperCase());

        //toLowercase
        System.out.println("Lenght: "+name.toLowerCase());

        //trim = remove espaços em branco do início e do fim do programa
        System.out.println("Lenght: "+name.trim());

        //replace = trocar o caractere
        System.out.println("Lenght: "+name.replace("n", name));

    }

}
