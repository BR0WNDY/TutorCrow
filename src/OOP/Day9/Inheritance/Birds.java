package OOP.Day9.Inheritance;
import OOP.Day9.Inheritance.Animal;
public class Birds extends Animal{
    Boolean canTalk;

    public Birds(String name,int age,String color, Boolean canTalk){
        super(name,age,color);
        this.canTalk = canTalk;
    }
    public void fly(){
        System.out.printf("This %s is flying..." , super.name);
    }
}
