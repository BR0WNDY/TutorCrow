package classwork.week7.P1;
import classwork.week7.P1.Vehicle;
public class Car extends Vehicle{
    private int numofdoors;
    public Car (String color,int numofdoors){
        super (color);
        this.numofdoors = numofdoors;
    }
    public void setDoor(int numofdoor){
        this.numofdoors = numofdoor;
    }
    public int getDoor() {
        return this.numofdoors;


    }
}
