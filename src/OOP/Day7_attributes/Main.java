package OOP.Day7_attributes;

public class Main {
    public static void main(String[] args) {
        Book HP = new Book ("Harry Potter and the Philosopher's Stone",350,"JKR",true);
//        System.out.println("Book");
//        System.out.println("================");
//        System.out.println("Name: " +HP.name);
//        System.out.println("Price: " + HP.price);
//        System.out.println("Author: " + HP.author);
//        System.out.println("Is Avaliable: " + HP.isAvailable);
        showAttribute(HP);

        Book PYG = new Book ("Python Guide" ,1500,"oReilly",true);
//        System.out.println();
//        System.out.println("Book");
//        System.out.println("============================");
//        System.out.println("Name: " + PYG.name);
//        System.out.println("Price: " + PYG.price);
//        System.out.println("Author: " + PYG.author);
//        System.out.println("Is Avalieble: " + PYG.isAvailable);
        showAttribute(PYG);
        PYG.name = "New Python Guide 2027";
        showAttribute(PYG);
        HP.name = "Harry Potter and the Philosopher's Stone Pro Max";
        HP.price = 1190;
        showAttribute(HP);
    }
    public static void showAttribute(Book book){
        System.out.println("\n Book");
        System.out.println("==================");
        System.out.println("Name: "+ book.name);
        System.out.println("Price: "+book.price);
        System.out.println("Author: "+book.author);
        System.out.println("Is Avaliable: "+book.isAvailable);
    }
}