package OOP.Day10.overriding;

public class Animal {
    String name;
    int age;
    String color;

    public Animal(String name,int age , String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void sleep(){
        System.out.println("This Animal is Sleeping....");
    }
    public void showINFO(){
        System.out.println("Name " + this.name);
        System.out.println("Ages " + this.age);
        System.out.println("Color " + this.color);
    }
}
