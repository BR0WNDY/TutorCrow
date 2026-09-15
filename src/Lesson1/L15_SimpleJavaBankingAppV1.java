package Lesson1;

import java.util.Scanner;

/*
Welcome to Banking App!
Press these to continue (1, 2, 3)
1 = withdrawal
2 = deposit
3 = exit


1
How much would you like to withdrawal?
1000
Done. 1000 baht came of the ATM machine.

2
How much would you like to deposit?
500
Done. Please put 500 baht in the machine.

3
Thank you for using our bank.

 */

public class L15_SimpleJavaBankingAppV1 {
    public static void main(String[] args) {
        int balance = 2000;
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning){
            String welcomeinfo = "Welcome to Banking App! " + balance +" baht\n" +
                    "Press these to continue (1, 2, 3)\n" +
                    "1 = withdrawal\n" +
                    "2 = deposit\n" +
                    "3 = exit";
            System.out.println("===================================");
            System.out.println(welcomeinfo);

            String ATMinput = scanner.nextLine();
            if (ATMinput.equals("1")){
                System.out.println("How much would you like to withdrawal?");
                String Withdrawinput = scanner.nextLine();
                int WithdrawAmount = Integer.parseInt(Withdrawinput);
                if (WithdrawAmount <= balance){
                    System.out.println("Done." + Withdrawinput +" Baht came out of ATM Machine");
                    balance -= WithdrawAmount;
                }else if (WithdrawAmount > balance){
                    System.out.println("You have money only " + balance);
                }else{
                    System.out.println("Wrong input please try again");
                }
            }else if (ATMinput.equals("2")){
                System.out.println("How much would you like to withdrawal?");
                String despositinput = scanner.nextLine();
                int despositAmount = Integer.parseInt(despositinput);
                if (despositAmount <= balance){
                    System.out.println("Done." + despositinput +" Baht cam" +
                            "e out of ATM Machine");
                    balance += despositAmount;
                }else if (despositAmount > balance){
                    System.out.println("You have money only" + balance);
                }else{
                    System.out.println("Wrong input please try again");
                }
            }else if (ATMinput.equals("3")){
                System.out.println("Thank for using our bank.");
                isRunning = false;
            }
        }

    }
}
