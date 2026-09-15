package Lesson1;
import java.util.ArrayList;
import java.util.List;

public class L17_MoreArrayList {
    public static void main(String[]args) {
        ArrayList<String> groceryList = new ArrayList<String>();
        groceryList.add("Apple");
        groceryList.add("Banana");
        groceryList.add("Onion");
        groceryList.add("Pork");
        groceryList.add("Chicken");
        groceryList.add("Eggs");
        System.out.println(groceryList);

        groceryList.set(1, "Orange");
        System.out.println(groceryList);

        groceryList.add("Noodles");
        System.out.println(groceryList);
        //delete
        groceryList.remove("Pork");
        System.out.println(groceryList);
        System.out.println();
        System.out.println("==================================");
        for (int a = 0; a < groceryList.size(); a++) {
            String item = groceryList.get(a);
            groceryList.set(a, item.toUpperCase());
        }
        System.out.println("Loop Finished");
        System.out.println(groceryList);
        System.out.println("==================================");
        for (int i = 0; i < groceryList.size(); i++) {
            String items = groceryList.get(i);
            groceryList.set(i, items.toLowerCase());


        }

        System.out.println(" To Lower Case");
        System.out.println(groceryList);
        System.out.println("================================================");

        ArrayList<String> names = new ArrayList<>(List.of("Liam","Olivia","Noah","Emma","Oliver","Charlotte","Elijah","Amelia","James","Sophia","William","Isabella","Benjamin","Mia","Lucas","Evelyn","Henry","Harper","Alexander","Camila","Mason","Gianna","Michael","Abigail","Ethan","Luna","Daniel","Ella","Jacob","Elizabeth","Logan","Sofia","Jackson","Emily","Levi","Avery","Sebastian","Mila","Mateo","Scarlett","Jack","Eleanor","Owen","Madison","Theodore","Layla","Aiden","Penelope","Samuel","Aria","Joseph","Chloe","John","Grace","David","Ellie","Wyatt","Nora","Matthew","Hazel","Luke","Zoey","Asher","Riley","Carter","Victoria","Julian","Lily","Grayson","Aurora","Leo","Violet","Jayden","Nova","Gabriel","Hannah","Isaac","Emilia","Lincoln","Zoe","Anthony","Stella","Hudson","Everly","Dylan","Isla","Ezra","Leah","Thomas","Lillian","Charles","Addison","Christopher","Willow","Jaxon","Lucy","Maverick","Paisley","Josiah","Natalie","Isaiah","Naomi"));
        for (int i = 0; i <names.size(); i++){
            String items = names.get(i);
            names.set(i,items.toUpperCase());
        }
        System.out.println("to Upper Case for Names");
        System.out.println(names);
        System.out.println("================================================");
        ArrayList<String> names2 = new ArrayList<>(List.of("Liam","Olivia","Noah","Emma","Oliver","Charlotte","Elijah","Amelia","James","Sophia","William","Isabella","Benjamin","Mia","Lucas","Evelyn","Henry","Harper","Alexander","Camila","Mason","Gianna","Michael","Abigail","Ethan","Luna","Daniel","Ella","Jacob","Elizabeth","Logan","Sofia","Jackson","Emily","Levi","Avery","Sebastian","Mila","Mateo","Scarlett","Jack","Eleanor","Owen","Madison","Theodore","Layla","Aiden","Penelope","Samuel","Aria","Joseph","Chloe","John","Grace","David","Ellie","Wyatt","Nora","Matthew","Hazel","Luke","Zoey","Asher","Riley","Carter","Victoria","Julian","Lily","Grayson","Aurora","Leo","Violet","Jayden","Nova","Gabriel","Hannah","Isaac","Emilia","Lincoln","Zoe","Anthony","Stella","Hudson","Everly","Dylan","Isla","Ezra","Leah","Thomas","Lillian","Charles","Addison","Christopher","Willow","Jaxon","Lucy","Maverick","Paisley","Josiah","Natalie","Isaiah","Naomi"));
        ArrayList<String> shortenedNames = new ArrayList<>();

        for (String name : names2) {
            if (name.length() >= 3) {
                shortenedNames.add(name.substring(0, 3).toUpperCase());
            } else { //this for if not in the list like 3 letter will be print only in text

                shortenedNames.add(name.toUpperCase());
            }
        }
        System.out.println(shortenedNames);
    }
}
