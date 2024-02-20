package Codigos;
import javax.swing.JOptionPane;

public class Code022_Return {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro valor: "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro valor: "));
        JOptionPane.showMessageDialog(null,"A soma dos dois valores é: "+soma(x, y));
    }

    static int soma(int valor01, int valor02){
        return valor01 + valor02;
    }
}
