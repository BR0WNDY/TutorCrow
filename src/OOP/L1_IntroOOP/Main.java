package OOP.L1_IntroOOP;
import OOP.L1_IntroOOP.Dog;
import OOP.L1_IntroOOP.Cat;
import OOP.L1_IntroOOP.Human;
public class Main {
    public static void main() {
        Dog firstDog = new Dog("Mike",8,true);
        Dog secondDog = new Dog("Jake", 10,false);
        System.out.println(firstDog.name);
        System.out.println(firstDog.age);
        System.out.println(firstDog.isHealthy);
        System.out.println(secondDog.name);
        System.out.println(secondDog.age);
        System.out.println(secondDog.isHealthy);

        Cat firstCat = new Cat("Moony",10,true);
        Cat secondCat = new Cat("Wormtail",7,true);
        System.out.println(firstCat.name);
        System.out.println(firstCat.age);
        System.out.println(firstCat.color);
        System.out.println(secondCat.name);
        System.out.println(secondCat.age);
        System.out.println(secondCat.color);

        Human potter = new Human("Harry Potter",10,3);
        System.out.println(potter.name);
        System.out.println(potter.hp);

        System.out.println("Before Damage");
        System.out.println(potter.hp);
        System.out.println("After Damage");
        potter.takeDamage(3);
        System.out.println(potter.hp);
        Human nate = new Human("Nate",12,2);
        System.out.println("Nate got attacked by Harry !!!!!");
        potter.doDamage(nate);
        System.out.println("Nate HP After Attack "+nate.hp);
        potter.regenHp(3);
        System.out.print("Harry Was got HP Regen " + potter.hp);
    }
}
