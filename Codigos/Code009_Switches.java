package Codigos;

public class Code009_Switches {
    public static void main(String[] args) {
        String day = "Quinta";

        switch (day) {
            case "Segunda":
                System.out.println("01");
                break;
            case "Terça":
                System.out.println("02");
                break;
            case "Quarta":
                System.out.println("03");
                break;
            case "Quinta":
                System.out.println("04");
                break;
            case "Sexta":
                System.out.println("05");
                break;
            case "Sabado":
                System.out.println("06");
                break;
            case "Domingo":
                System.out.println("07");
                break;

            default:
                break;
        }
    }
}
