package OOP.Day10.overriding;

public class Birds extends Animal {
    Boolean canTalk;

    public Birds(String name,int age,String color, Boolean canTalk){
        super(name,age,color);
        this.canTalk = canTalk;
    }
    public void fly(){
        System.out.printf("This %s is flying..." , super.name);
    }
    @Override
    public void sleep(){
        System.out.println("This Bird is Sleeping !!!!");
    }
    @Override
    public void showINFO(){
        System.out.println("Name " + this.name);
        System.out.println("Ages " + this.age);
        System.out.println("Color " + this.color);
        System.out.println("This bird can talk: "+ canTalk);
    }
}
