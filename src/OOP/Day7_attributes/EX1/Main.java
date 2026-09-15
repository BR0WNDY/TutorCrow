package OOP.Day7_attributes.EX1;

public class Main {
    public static void main(String[] args) {
        Food F1 = new Food ("Frice Rice",60,"Good Food",true);
        answer(F1);
        Food F2 = new Food ("Pizza",299,"Pizza House",false);
        answer(F2);
        Food crowOrder = new Food ("Noodles",70,"Boat Noodles Shop",true);
        answer(crowOrder);
        crowOrder.price = 50;
        answer(crowOrder);

    }


    public static void answer(Food Food){
        System.out.println("Food:");
        System.out.println("==================");
        System.out.println("Name: "+ Food.name);
        System.out.println("Price: "+Food.price);
        System.out.println("Restaurant: "+Food.restaurant);
        System.out.println("Is Avaliable: "+Food.isAvaliable);
    }

}
