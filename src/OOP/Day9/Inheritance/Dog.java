package OOP.Day9.Inheritance;

public class Dog extends Animal{
     public Dog(String name,int age,String color){
         super(name, age, color);
     }
     public void bite() {
        System.out.println("He's Bite a Sofa");
    }
}
