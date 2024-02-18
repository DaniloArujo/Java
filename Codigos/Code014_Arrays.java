package Codigos;

public class Code014_Arrays {
    public static void main(String[] args) {
        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Mustang";
        cars[2] = "Tesla";

        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        //posso modificar o tamanho da string em java o.0
        cars[0] = "Umastringdeliberadamentegrande";

        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

        String[] colors = {"Amarelo", "Verde", "Vermelho", "Azul"};

        for(int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }
    }
}
