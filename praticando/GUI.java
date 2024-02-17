package praticando;
import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Qual é o seu nome ? ");
        JOptionPane.showMessageDialog(null,"Olá " + name);
    }
}