package OOP.Day10.overriding;

public class Main {
    public static void main(String[]args) {
       Dog mydog = new Dog("Pot",4,"Red","Hot Dog");
       mydog.showINFO();
       mydog.bite();
       mydog.sleep();

       Birds chicken = new Birds("Nugget",1,"Brown",false);
        chicken.showINFO();
        chicken.sleep();

        Fish nemo = new Fish("Nemo",2,"Orange",true);
        System.out.println("====================");
        nemo.showINFO();
        nemo.swim();
    }
}
