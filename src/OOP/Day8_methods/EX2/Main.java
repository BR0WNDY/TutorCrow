package OOP.Day8_methods.EX2;

import OOP.Day8_methods.EX1.Car;

public class Main {
    public static void main(String[] args){
        TrueMoneyAccount num1 = new TrueMoneyAccount ("Harry Potter" , 9999999,1000);
        num1.showAccountInfo();
        num1.withdrawl(15);
        num1.withdrawl(200);
        num1.withdrawl(75);
        num1.withdrawl(700);
        num1.withdrawl(100);
        num1.topup(500);

        TrueMoneyAccount num2 = new TrueMoneyAccount ("Ron Weasley" , 9999999,1);
        num1.transferMoney(num2,150);
        num2.chargeYearFee(100);

        TrueMoneyAccount num3 = new TrueMoneyAccount("Hermione",99999999,0);
        num3.transferMoney(num2,100);
        num3.topup(1000);
        num3.showAccountInfo();







    }
}
