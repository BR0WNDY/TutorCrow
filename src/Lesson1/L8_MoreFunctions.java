package Lesson1;

public class L8_MoreFunctions {
    public static void main() {
        cookMamaNoodles(5, 2);
    }

    /**
     * This functions to print egg flying process
     */
    static void fryEgg(){
        System.out.println(">>>>> Starting to cooke egg");
        System.out.println("Heating Pan....");
        System.out.println("Adding Oil....");
        System.out.println("getting egg....");
        System.out.println("Cracking egg....");
        System.out.println("putting seasoning....");
        System.out.println("Cooking egg");
        System.out.println("Serving Egg");
        System.out.println(">>>>> Egg Done");
    }
    // [Meaning] Functions Definitions = the place where code is written
    static void cookMamaNoodles(int spicyLevel, int numberofFriedEgg) {
        System.out.println(" ");
        System.out.println("Opeing Packages....");
        System.out.println("Boiling a Water....");
        System.out.println("Adding Noodles to a Water....");
        if (spicyLevel > 0) {
            System.out.println("Adding " + spicyLevel + " chili for spicy level " + spicyLevel +"........");
        }

        System.out.println("Adding Seasoning to Water...");
        System.out.println("Wating in 3 minutes....");
        System.out.println("Noodles are Done");
        if (numberofFriedEgg > 0) {
            System.out.printf("Adding %d fried eggs....\n", numberofFriedEgg);
            System.out.println("Putting Egg on Noodle....");
        }

    }
}