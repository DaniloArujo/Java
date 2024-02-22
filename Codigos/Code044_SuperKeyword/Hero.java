package Codigos.Code044_SuperKeyword;

public class Hero extends Person{
    String power;
    

    Hero(String name,int age, String power){
        super(name, age);
        this.power = power;
    }

    @Override
    public String toString() {
        System.out.println(this.name);
        
        System.out.println(this.age);
        
        System.out.println(this.power);
        return super.toString();
    }
}
