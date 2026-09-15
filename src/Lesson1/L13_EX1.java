package Lesson1;

public class L13_EX1 {
    public static void main() {
        cookBoatNoodles();
        cookBoatNoodles("meat");
        cookBoatNoodles("meat",true);
    }
    static void cookBoatNoodles(){
        System.out.println("==============================================");
        System.out.println("Starting cook");
        System.out.println("Boiling Water");
        System.out.println("Adding soup ingredent");
        System.out.println("Cook a soup with ingredent");
        System.out.println("Adding Noodles in soup");
        System.out.println("finish add the noodles in bowl and serve");
        System.out.println("==============================================");

    }
    static void cookBoatNoodles(String meat){
        System.out.println("==============================================");
        System.out.println("Starting cook");
        System.out.println("Boiling Water");
        System.out.println("Adding soup ingredent");
        System.out.println("Cook a soup with ingredent");
        System.out.println("Adding meat in noodles");
        System.out.println("Adding Noodles in soup");
        System.out.println("finish add the noodles in bowl and serve");
        System.out.println("==============================================");


    }
    static void cookBoatNoodles(String meat , boolean isbigsize){
        System.out.println("==============================================");
        System.out.println("Starting cook");
        System.out.println("Boiling Water");
        System.out.println("Adding soup ingredent");
        System.out.println("Cook a soup with ingredent");
        System.out.println("adding meat in noodles");
        System.out.println("Adding Noodles in soup");
        if (isbigsize == true){
            System.out.println("finish add the noodles in bowl with bigger size and serve");
            System.out.println("==============================================");
        }else{
            System.out.println("finish add the noodles in bowl and serve");
            System.out.println("==============================================");
        }




    }
}
