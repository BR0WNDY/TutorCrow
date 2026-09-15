package classwork.week7.P1;

public class Main {
    public static void main() {
     Car car1 = new Car("Red",4);
     car1.setDoor(3);
     System.out.println(car1.getDoor());
     car1.showINFO();
     car1.drive();
    }
}
