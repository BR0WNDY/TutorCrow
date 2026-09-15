package OOP.Day9.defaultAttributes;

public class Main {
    public static void main(String[] args) {
        Pencil pencil1 = new Pencil(10,200);
        pencil1.showPencil();
        pencil1.color = "Blue";
        pencil1.showPencil();
        System.out.println("===============");
        Pencil pencil2 = new Pencil(100,2000);
        pencil2.showPencil();
    }
}
