package OOP.Day9.Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog BoomDog = new Dog("Harry",4,"Golden");
        BoomDog.showINFO();
        BoomDog.bite();
        System.out.println("==================");
        Birds Parrot = new Birds("James",2,"Red",true);
        Parrot.showINFO();
        Parrot.fly();
    }
}
