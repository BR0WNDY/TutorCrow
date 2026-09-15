package OOP.Day10.overriding;

public class Dog extends Animal {
    String breed;
     public Dog(String name,int age,String color,String breed){
         super(name, age, color);
         this.breed = breed;
     }
     public void bite() {
        System.out.println("He's Bite a Sofa");
    }
    @Override
    public void sleep(){
        System.out.println("This Dog is Sleeping !!!!");
    }
    @Override
    public void showINFO(){
        System.out.println("Name: " + this.name);
        System.out.println("Ages: " + this.age);
        System.out.println("Color: " + this.color);
        System.out.println("Breed: "+ this.breed);
        System.out.println("=========================");
    }
}
