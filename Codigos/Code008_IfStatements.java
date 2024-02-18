package Codigos;
import javax.swing.JOptionPane;

public class Code008_IfStatements {
    
    public static void main(String[] args){
        int age = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade: "));
        if(age > 60){
            JOptionPane.showMessageDialog(null, "Você é idoso");
        }else if(age >= 18){
            JOptionPane.showMessageDialog(null, "adulto");
        }else if (age <= 18 && age > 0){
            JOptionPane.showMessageDialog(null,"Criança");
        }else{
            JOptionPane.showMessageDialog(null,"Idade inválida");
        }
    }
}
