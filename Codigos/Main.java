import java.util.ArrayList;
import java.util.List;

abstract class FiguraGeometrica {
    public abstract String getDescricao();
    public abstract double getArea();
}

class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String getDescricao () {
        return "Retangulo com base " + base + " e altura " + altura;
    }

    @Override
    public double getArea(){
        return base * altura;
    }
}

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String getDescricao() {
        return "Triangulo com base " + base + " e altura " + altura;
    }

    @Override
    public double getArea () {
        return (base * altura) / 2;
    }
}

class Circulo extends FiguraGeometrica {
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String getDescricao() {
        return "Circulo com raio " + raio;
    }

    @Override
    public double getArea() {
        return 3.14 * Math.pow(raio, 2);
    }
}

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(5);
        retangulo.setAltura(3);

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(4);
        triangulo.setAltura(2.5);

        Circulo circulo = new Circulo( );
        circulo.setRaio(2);

        // Adiciona as figuras geométricas em uma lista
        List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>();
        listaFigurasGeometricas.add(retangulo);
        listaFigurasGeometricas.add(triangulo);
        listaFigurasGeometricas.add(circulo);

        // Mostra dados das figuras geométricas
        for (FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
            System.out.println(figuraGeometrica.getDescricao());
            System.out.printf("Area da figura: %.2f\n", figuraGeometrica.getArea());
        }
    }
}
