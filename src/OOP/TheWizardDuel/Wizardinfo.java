package OOP.TheWizardDuel;

public class Wizardinfo {
    public String name;
    public int hp;
    public int damage;

    // Your INFO
    public Wizardinfo(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    // Method to take damage
    public void takeDamage(int amount) {
        this.hp -= amount;
        if (this.hp < 0) {
            this.hp = 0; // can't negative in health
        }
    }

    // Use Potions
    public void regenHp(int amount) {
        this.hp += amount;
        if (this.hp > 100) {
            this.hp = 100; // Caps health at 100
        }
    }

    // check you are alive or not
    public boolean isAlive() {
        return this.hp > 0;
    }
}