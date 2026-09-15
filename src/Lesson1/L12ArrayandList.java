package Lesson1;
import java.util.ArrayList;
import java.util.List;

public class L12ArrayandList {
    public static void main() {
        // Array in JAVA
        //You can't add or remove stuff in Arrays
        String[] studentnames = {"Harry","Lilly","Mark"};
        System.out.println(studentnames[0]);
        System.out.println(studentnames[2]);
        double[] scores = {1.2,2.4,0.5,-4.3};
        System.out.println(scores[0]);

        //List in JAVA (Array List)
        //need import
        ArrayList<String> customers = new ArrayList<String>();
        customers.add("Harry");
        customers.add("Lilly");
        customers.add("Mark");
        // How many items in list
        System.out.println(customers.size());

        System.out.println(customers.get(0));
        System.out.println(customers.get(1));
        System.out.println(customers.get(2));

        //Del something in List
        customers.remove("Lilly");
        System.out.println(customers.get(1));
        System.out.println(customers.size());

        customers.set(1, "Oliver");
        System.out.println("=======================");
        //Print Customer size is mean print in object
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
        System.out.println("=======================");

        //Deleteing all items
        customers.clear();
        // add customers
//        customers.add("Snape");
        printList(customers);
//        for (int i = 0; i < customers.size(); i++) {
//            System.out.println(customers.get(i));
//        }

        // adding items in one line
        ArrayList<Integer> ages = new ArrayList<Integer>(
                List.of(1,5,5,2,7)
        );
        for (int i = 0; i < ages.size(); i++) {
            System.out.println(ages.get(i));
        }
        ArrayList<Double> num = new ArrayList<Double>(
                List.of(1.2,5.1,5.2,2.4,7.1)
        );
        for(int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }



    }
    static void printList(ArrayList<String> list) {
        System.out.println("====================");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    static void printListInt(ArrayList<Integer> list) {
        System.out.println("====================");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
