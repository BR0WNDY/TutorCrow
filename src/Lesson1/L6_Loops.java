package Lesson1;
import java.util.ArrayList;
public class L6_Loops {
    public static void main() {
        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello!" + i);
        }
        // if this will be infinie loop
//        while(true){
//            System.out.println("Hi");
//        }
        //index starts 0 to XX
        //Size is Starts 1 to XX
        ArrayList<String> groceryList = new ArrayList<String>();
        groceryList.add("Apple");
        groceryList.add("Banana");
        groceryList.add("Onion");
        groceryList.add("Pork");
        groceryList.add("Chicken");
        groceryList.add("Eggs");
        System.out.println(groceryList);
        System.out.println("============================");
        for (int h = 0; h < groceryList.size(); h++) {
            System.out.println(groceryList.get(h));
        }
        System.out.println("============================");
    }
}
