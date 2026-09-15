package OOP.Day10.overriding;

public class Fish extends Animal{
    boolean canswim;
    public Fish (String name, int age, String color,boolean canswim){
        super(name,age,color);
        this.canswim = canswim;
    }
    public void swim(){
        System.out.println("This fish is swimming !!!!");
    }
}
