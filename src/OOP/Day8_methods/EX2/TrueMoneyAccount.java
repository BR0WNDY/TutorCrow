package OOP.Day8_methods.EX2;

public class TrueMoneyAccount {
    String owner;
    int phonenumber;
    int balance;

    public TrueMoneyAccount (String owner,int phonenumber,int balance){
        this.owner = owner;
        this.phonenumber = phonenumber;
        this.balance = balance;

    }
    public void showAccountInfo(){
        System.out.println("Hello " + this.owner);
        System.out.println("You Phone Number is " + this.phonenumber);
        System.out.println("You have balance " + this.balance);
    }
    public void withdrawl(int Amount){
        System.out.println("\n");
        this.balance = this.balance - Amount;
        if (balance < 0){
            this.balance = 0;
            System.out.println("You are Broke to buy CP Products !!!! "+ this.balance);
        }else{
            System.out.println("You withdrawl money from your account " + Amount);
            System.out.println("You have money after withdrawl is " + this.balance);
        }

    }
    public void topup (int Amount){
        System.out.println("\n");
        this.balance = this.balance + Amount;
        System.out.println("You Touup True Money Account and CP happy you for making they rich "+ this.balance);
    }
    public void transferMoney(TrueMoneyAccount targetAccount , int Amount){
        this.balance = this.balance - Amount;
        System.out.println("\n");
        System.out.println("You transfer money to " + targetAccount.owner + " amount is "+ Amount);
        targetAccount.balance = targetAccount.balance + Amount;
        System.out.println("Your new balance is " + this.balance);
        System.out.println(targetAccount.owner + " new balance is " + targetAccount.balance);
    }
    public void chargeYearFee(int amount){
        this.balance = this.balance - amount;
        System.out.println("\n");
        System.out.println("You got charge yearly fee " + amount);
    }
}
