package OOP.Day9.defaultAttributes;

public class Pencil {
    String color;
    int length;
    double price;

    public Pencil (int length, double price){ //remove argument for default attribute
        //Defult color is Yellow
        this.color = "Yellow";
        this.length = length;
        this.price = price;

    }
    public void showPencil(){
        System.out.println("Color " + this.color);
        System.out.println("Length " + this.length);
        System.out.println("Price " + this.price);
    }

}
