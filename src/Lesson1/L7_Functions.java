package Lesson1;

public class L7_Functions {
    public static void main(String[] args) {
        // Functions are use when you don't want to copy and paste again and again
//        cookEgg();
//        System.out.println("---");


//        for(int i = 0;i<100; i++){
//            cookEgg();
//        }
        cookRice();
        cookMamaNoodles(false,false);
        cookMamaNoodles(false,false);
        cookMamaNoodles(true,false);
        cookMamaNoodles(true,false);
        cookMamaNoodles(false,true);
        cookMamaNoodles(true,true);
        riceAndEggSet();

    }

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
    static void cookRice(){
        System.out.println("Washing Rice....");
        System.out.println("Putting Rice Cooker....");
        System.out.println("adding water....");
        System.out.println("pluging the cable....");
        System.out.println("Wating....");
        System.out.println("Rice is Done");

    }
    static void cookMamaNoodles(boolean addingchili,boolean addFriedEgg){
        System.out.println(" ");
        System.out.println("Opeing Packages....");
        System.out.println("Boiling a Water....");
        System.out.println("Adding Noodles to a Water....");
        if (addingchili == true){
            System.out.println("Adding Chili in Noodle....");
        }
        System.out.println("Adding Seasoning to Water...");
        System.out.println("Wating in 3 minutes....");
        System.out.println("Noodles are Done");
        if (addFriedEgg == true){
            fryEgg();
            System.out.println("Putting Egg on Noodle....");
        }
        System.out.println("===============");

    }

    static void riceAndEggSet(){
        cookRice();
        fryEgg();
    }
}
