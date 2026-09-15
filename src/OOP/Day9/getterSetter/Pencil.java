package OOP.Day9.getterSetter;

public class Pencil {
    String color;
    private int length;
    private double price;

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
        System.out.printf("\n");
    }
    //getter and setter = methold to change private attube
    //setter for price
    public void setPrice(double price){
        this.price = price;
    }
    //getter for get price
    public double getPrice(){
        return this.price;
    }

    //setter for length
    public void setLength(double length){
        this.price = length;
    }
    //getter for get length
    public double getLength(){
        return this.length;
    }


}
