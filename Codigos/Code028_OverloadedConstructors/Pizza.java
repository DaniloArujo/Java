package Codigos.Code028_OverloadedConstructors;

public class Pizza {
    
    String bread;
    String sauce;
    String cheese;
    String tooping;

    Pizza(String bread, String sauce, String cheese, String tooping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.tooping = tooping;
    }
    
    Pizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

}
