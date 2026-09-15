package OOP.Day8_methods;

public class Character {
    String name;
    int health;
    String weapon;
    int level;

    public Character(String name, int health, String weapon , int level){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.level  = level;
    }
    public void levelUp (Character character){
        System.out.println("\n");
        character.level = character.level + 1;
        System.out.println("Level Up!!!!!!!!");
        System.out.println("Your new level is " + character.level);
        System.out.println("Congrats ***************");
    }
    public void levelUpProMax (Character character ,int howMany){
        System.out.println("\n");
        character.level = character.level + howMany;
        System.out.println("Level up so many levels!!!");
        System.out.println("Your new level is " + character.level);
        System.out.println("Congrats $$$$$$$$$$$$$$$$$$$$$");
    }
    public void regeneration(){
        System.out.println("\n");
        this.health = this.health + 1;
        System.out.println("You got a regen by 1 current health " + this.health);
    }
    public void bigHeal (int healAmount){
        this.health = this.health + healAmount;
        System.out.println("You pay a Microtractions to get a Big Heal " + healAmount);
        System.out.println("Current HP is: "+ this.health);
    }
    public void takedamage (int damageTaken){
        this.health = this.health - damageTaken;
        if(health < 0){
            this.health = 0;
            System.out.println("\n You are attacked and you lost health by " + damageTaken);
            System.out.println("Current health = " + this.health);
            System.out.println("You died!!!");
        }else{
            System.out.println("\n You are attacked and you lost health by " + damageTaken);
            System.out.println("Current health = " + this.health);
            System.out.println("You Still Alive!!!");
        }
    }

}
