package OOP.L2_simpleGame;

import java.util.Scanner;
import OOP.L2_simpleGame.Human;
public class Main {
    public static void main(String[] args) {
        Human mainCharacter = new Human("Boom",100,5);
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning){
            System.out.printf("Name = %s , HP = %d , Damage = %d",mainCharacter.name,mainCharacter.hp,mainCharacter.damage);
            System.out.println("What do you want to regen ('take dmg' , 'regen , 'exit')");

            String UserInput = scanner.nextLine();
            if (UserInput.equals("exit")){
                isRunning = false;
            }else if (UserInput.equals(("take dmg"))){
                mainCharacter.takeDamage(10);
            } else if (UserInput.equals("regen")) {
                mainCharacter.regenHp(5);
            }
        }
    }
}
