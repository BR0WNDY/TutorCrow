package OOP.Day8_methods;

public class Main {
    public static void main(String[] args) {
        Character C1 = new Character("Harry Potter",100,"MP5",2);
        answer(C1);
        C1.levelUp(C1);
        C1.levelUp(C1);
        C1.levelUp(C1);
        C1.levelUpProMax(C1, 10);
        C1.regeneration();
        C1.bigHeal(1);
        C1.takedamage(10);
        C1.takedamage(100);




    }
    public static void answer (Character Character){
        System.out.println("\n Character");
        System.out.println("Name: " + Character.name);
        System.out.println("Level: " + Character.level);
        System.out.println("Health: "+ Character.health);
        System.out.println("Weapons: " + Character.weapon);
    }

}
