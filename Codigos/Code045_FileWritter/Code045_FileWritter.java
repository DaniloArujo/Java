package Codigos.Code045_FileWritter;
import java.io.FileWriter;
import java.io.IOException;;

public class Code045_FileWritter {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \n Violets are blue");
            writer.append("\n\n Danilo Araujo Mota");
            
            writer.close();




        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
