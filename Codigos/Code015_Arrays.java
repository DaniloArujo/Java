package Codigos;

public class Code015_Arrays {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-50";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lambo";
        cars[2][2] = "Tesla";

        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j<3; j++){
                System.out.print(cars[i][j] + " ");
            }
        };

        String[][] cores = {{"Azul","Verde","Branco"},
                            {"Cinza","Preto","Marrom"}};


        for(int i = 0; i < 3; i++){
            System.out.println();
                for(int j = 0; j<3; j++){
                    System.out.print(cores[i][j] + " ");
                }
            };
    }
}
