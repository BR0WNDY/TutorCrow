package OOP.Day8_methods.EX1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car ("Speedy" , 120);
        answer(car1);
        car1.speedUp(car1);
        car1.superSpeedBoost(car1,10);
        car1.superSpeedBoost(car1,100);
        car1.gasTankEmpty();


    }
    public static void answer(Car car){
        System.out.println("\n Character");
        System.out.println("Name: " + car.name);
        System.out.println("Speed: " + car.speed);
    }
}
