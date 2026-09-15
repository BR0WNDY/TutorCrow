package OOP.TheWizardDuel;
import OOP.TheWizardDuel.Wizardinfo;

import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // Used for enemy's random moves

        System.out.println("Enter Your Character Name:");
        String name = scanner.nextLine();

        // Player Vs Enemy
        Wizardinfo mainCharacter = new Wizardinfo(name, 100, 5);
        Wizardinfo enemy = new Wizardinfo("Voldemort", 100, 10);

        System.out.println("\n--- THE DUEL BEGINS ---");
        System.out.printf("%s vs %s\n", mainCharacter.name, enemy.name);

        boolean isRunning = true;
        while (isRunning) {
            while (isRunning && mainCharacter.isAlive() && enemy.isAlive()) {

                // 1. Display Stats
                System.out.println("\n==================================");
                System.out.printf("[You] %s: %d HP  |  [Enemy] %s: %d HP\n",
                        mainCharacter.name, mainCharacter.hp, enemy.name, enemy.hp);

                // Your Turn choose actions or Spells or Use Potions Wigelweld
                System.out.println("Choose your action: ('avada kedavra', 'expelliarmus, 'drink wigelweld potions', 'exit')");
                System.out.print("> ");
                String userInput = scanner.nextLine().toLowerCase(); // convert to LoverCase if you add Upper Case they convert to Lower case

                if (userInput.equals("exit")) {
                    System.out.println("You fled the duel. Coward!");
                    isRunning = false;
                    continue;
                } else if (userInput.equals("avada kedavra")) { // The Max Damage for Harry Potter is AVADA KEDAVRA
                    // why doesn't instant kill because Harry He does not want have to Kill Someone
                    System.out.println("AVADA KEDAVRA !!!!!!!!!!!");
                    enemy.takeDamage(40);
                } else if (userInput.equals("expelliarmus")) {
                    System.out.println("Expelliarmus !!!!");
                    enemy.takeDamage(30);
                }else if (userInput.equals("sectumsempra")) {
                    System.out.println("Sectumsempra !!!!");
                    enemy.takeDamage(20);
                } else if (userInput.equals("crusio")) {
                    System.out.println("Crusio !!!!");
                    enemy.takeDamage(10);
                }else if (userInput.equals("wingadium leviosa")) { // The Lowest Damage is Wingadium Leviosa
                    System.out.println("Wingadium leviosa !!!!");
                    enemy.takeDamage(5);
                }else if (userInput.equals("drink potions")) { // Use Potions for more damage or Heal Your HP
                    System.out.println("What Potions you want to Drink");
                    if (userInput.equals("wigelweld potions")) {
                        System.out.println("You drink wigelweld potions !!!!");
                        mainCharacter.regenHp(25);
                    }
                    //No 60 if u fail to spell or wrong input skip to other turn
                } else {
                    System.out.println("Invalid spell! You fumbled your wand and lost your turn !!!!!!");
                }

                // Check Enemy HP is alive or not and if defeate show you win
                if (!enemy.isAlive()) {
                    System.out.println("\n*** " + enemy.name + " has been defeated! You win! ***");
                    break;
                }

                // Voldermort  Turn
                System.out.println("\n--- Voldermort Turn ---");
                // Random spell from 0 to 5 for enemy turn
                int enemyAction = random.nextInt(6);

                if (enemyAction == 0) { // The Max Damage is AVADA KEDAVRA
                    //[For PotterHead INFO]
                    // why instant kill because Voldermort want to Kills and want to get minster of Magic
                    // and the PureBlood only Wizard and for school is for PureBlood
                    //[For Muggle INFO / for Java thinking]
                    // This Parts if fail to spell they skip to another turn from no 60 part
                    // This part use maincharacter vs Enemy Damage this part is enemy turn
                    System.out.println(enemy.name + " AVADA KEDAVRA !!!!!!!!!!!");
                    mainCharacter.takeDamage(80);
                }else if (enemyAction == 1) {
                    System.out.println(enemy.name + " Crusio !!!!");
                    mainCharacter.takeDamage(enemy.damage);
                    mainCharacter.takeDamage(10);
                } else if (enemyAction == 2) {
                    System.out.println(enemy.name + " Wingadium leviosa !!!!");
                    mainCharacter.takeDamage(5);
                } else if (enemyAction == 3) {
                    System.out.println(enemy.name + " Sectumsempra !!!!");
                    mainCharacter.takeDamage(20);
                } else if (enemyAction == 4) {
                    System.out.println(enemy.name + " Expelliarmus !!!!");
                    mainCharacter.takeDamage(30);
                } else { //enemy can drink potions only wigenweld potions
                    System.out.println(enemy.name + " Drink wigelweld potions");
                    enemy.regenHp(15);
                }

                // Check Your HP is alive or not and if defeate show Voldermort win
                //by showing the last HP from Your Character + HP
                if (!mainCharacter.isAlive()) {
                    System.out.println("\n*** You have been defeated by " + enemy.name + "... The Minister of Magic and Hogwarts was gotten to DeadEater. ***");
                    break;
                }
            }

            scanner.close();
        }
    }
}