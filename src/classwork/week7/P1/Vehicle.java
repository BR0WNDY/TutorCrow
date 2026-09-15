package classwork.week7.P1;

public class Vehicle {
    String color;
    public Vehicle (String color){
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drive(){
        System.out.println("This Car is Moving ......");
    }
    public void showINFO(){
        System.out.println("Color " + this.color);

    }

}
