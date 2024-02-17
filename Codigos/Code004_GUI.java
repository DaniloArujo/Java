package Codigos;
import javax.swing.JOptionPane;

public class Code004_GUI {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter with your age: "));
        JOptionPane.showMessageDialog(null,"Sua idade é de: "+age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter with your height: "));
        JOptionPane.showMessageDialog(null,"Sua altura é de: "+height);
    }
}
