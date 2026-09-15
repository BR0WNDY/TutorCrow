package classwork.week6.EX1;

public class Runner {
    public static void main(String[] args) {
        DigitalWallet Num1 = new DigitalWallet ("Harry Potter",1000);
        Num1.showAccountInfo();

        DigitalWallet Num2 = new DigitalWallet ("Hermione Granger",100);
        System.out.println("============");
        Num2.showAccountInfo();
        Num1.tranperMoney(Num2,200);
        System.out.println("============");
        Num2.showAccountInfo();
        Num1.tranperMoney(Num2,-200);
        Num2.showAccountInfo();

    }
}
