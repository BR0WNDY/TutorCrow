package OOP.L2_simpleGame;

public class Human {
        String name;
        int hp;
        int damage;
        public Human(String name, int hp ,int damage) {
            this.name = name;
            this.hp = hp;
            this.damage = damage;
        }
        //functions by itself methold = function in a
        void takeDamage(int damage){
            this.hp = this.hp - damage;
        }
        void doDamage(Human otherPerson){
            otherPerson.hp = otherPerson.hp = this.damage;
        }
        void regenHp(int regenAmout){
            this.hp += regenAmout;
        }
    }

