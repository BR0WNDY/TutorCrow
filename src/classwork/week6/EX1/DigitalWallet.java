package classwork.week6.EX1;

public class DigitalWallet {
    String name;
    double balance;

    public DigitalWallet (String name,double balance){
        this.name = name;
        this.balance = balance;

    }
    public void showAccountInfo(){
        System.out.println("Hello " + this.name);
        System.out.println("You have balance " + this.balance);
    }

    public void tranperMoney (DigitalWallet targetAccount , double amoumt){
        if (amoumt > 0 && amoumt <= this.balance){
            this.balance = this.balance - amoumt;
            System.out.println("You transfer money to " + targetAccount.name + " amount is "+ amoumt);
            targetAccount.balance = targetAccount.balance + amoumt;
            System.out.println("Your new balance is " + this.balance);
            System.out.println(targetAccount.name + " new balance is " + targetAccount.balance);
        }else{
            System.out.println("You are broke");
        }
    }
}
