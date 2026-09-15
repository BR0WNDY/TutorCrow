package OOP.Day8_methods.EX1;

public class Car {
    String name;
    int speed;

    public Car (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public void speedUp(Car car){
        car.speed = car.speed + 10;
        System.out.println("You got Nitro 1 Tank you got boost up" + " "+ car.speed);
    }
    public void superSpeedBoost(Car car,int boost){
        car.speed = car.speed + boost;
        System.out.println("You Paid Diamond you got unlimited Boost for a " + car.speed + " Speed");
    }
    public void gasTankEmpty(){
        this.speed = 0;
        System.out.println("Your BenZene was ranout " + this.speed);
    }
}
