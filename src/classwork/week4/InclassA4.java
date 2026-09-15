package classwork.week4;

import java.util.Random;

public class InclassA4 {
    public static int rollDice(){
        Random random = new Random();
        int rollDice = random.nextInt(6); // the argument = end with - 1
        int result = rollDice + 1;
        return result;
    }
    public static void main(String[] args) {
        int dice1 = rollDice();
        System.out.println(dice1);
        int dice2 = rollDice();
        System.out.println(dice2);
        System.out.println("Total: " +(dice1 + dice2));
    }
}
