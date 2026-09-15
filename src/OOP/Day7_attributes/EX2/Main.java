package OOP.Day7_attributes.EX2;

public class Main {
    public static void main(String[]main) {
        Character C1 = new Character("Boom",68,"MP5",12);
        answer(C1, 1);
        Character C2 = new Character("Crow", 100 ,"M4A1",45);
        answer(C2, 2);

        C2.health = 90;
        answer(C2,2);

        C1.weapon = "RPG";
        answer(C1,1);

        C1.health = C1.health * 2;
        answer(C1,1);

        C2.level = C2.level + 1;
        answer(C2,2);

    }
    public static void answer(Character Character, int number){
        System.out.println("\nChracter " + number);
        System.out.println("==================");
        System.out.println("Name: "+ Character.name);
        System.out.println("Health: "+Character.health);
        System.out.println("Weapons: "+Character.weapon);
        System.out.println("Level: "+Character.level);
    }


}
