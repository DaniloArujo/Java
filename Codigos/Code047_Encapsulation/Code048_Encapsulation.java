package Codigos.Code047_Encapsulation;

public class Code048_Encapsulation {
    public static void main(String[] args) {
        //Encapsulation = atributos de uma classse são escondidos ou privados. podendo ser acessados apenas por metodos.
        //você deve manter os atributos privados caso não exista uma razão para torna-los publicos.

        Car car = new Car("Volks", "fusca", 1995);

        //System.out.println(car.year);
        System.out.println(car.getMake());

        //car.model = "Teste";
    }
}
