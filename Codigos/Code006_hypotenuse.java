package Codigos;
import javax.swing.JOptionPane;

public class Code006_hypotenuse {
    public static void main(String[] args) {
        double var01 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do primeiro lado: "));
        double var02 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do primeiro lado: "));

        
        double hypotenusa =  Math.sqrt(Math.pow(var01,2)+Math.pow(var02,2));

        JOptionPane.showMessageDialog(null, "O resultado é: "+hypotenusa);

    }
}
