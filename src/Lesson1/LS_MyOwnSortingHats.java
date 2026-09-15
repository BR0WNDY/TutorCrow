package Lesson1; //my own base on ur example and ai for guide such as questions
import java.util.Scanner;
public class LS_MyOwnSortingHats {
    public static void main(String[] args){
        System.out.println("You are a Hogwarts Students to Sorting a House");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your name : ");
        String userName = scanner.nextLine();
        System.out.println("Hello Mr." + userName);
        System.out.println("You are a Hogwarts Students to Sorting a House");
        Scanner scanner1 = new Scanner(System.in);
        int ravenclaw = 0;
        int gryffindor = 0;
        int slytherin = 0;
        int hufflepuff = 0;

        String[] questions = {
                "1. What do you value most?\n  1. Wisdom\n  2. Ambition\n  3. Bravery\n  4. Loyalty",
                "2. What would you do with a free afteranoon?\n  1. Read a book\n  2. Plan your next goal\n  3. Go on an adventure\n  4. Spend time with friends",
                "3. Pick a magical creature:\n  1. Eagle\n  2. Serpent\n  3. Lion\n  4. Badger",
                "4. Your ideal teacher is:\n  1. Brilliant and logical\n  2. Strategic and cunning\n  3. Bold and inspiring\n  4. Kind and patient",
                "5. You find a wallet on the ground. You:\n  1. Analyze the best course of action\n  2. Keep it if no one is watching\n  3. Turn it in heroically\n  4. Post about it to find the owner",
                "6. Your favorite subject would be:\n  1. Charms\n  2. Potions\n  3. Defense Against the Dark Arts\n  4. Herbology",
                "7. What is most important to you?\n  1. Knowledge\n  2. Power\n  3. Courage\n  4. Friendship",
                "8. How do you handle conflict?\n  1. Think it through logically\n  2. Use it to your advantage\n  3. Face it head-on\n  4. Seek a peaceful resolution",
                "9. Pick a color:\n  1. Blue\n  2. Green\n  3. Red\n  4. Yellow",
                "10. Your greatest fear is:\n  1. Ignorance\n  2. Failure\n  3. Cowardice\n  4. Being alone"
        };
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();


            if (choice == 1) ravenclaw++;
            else if (choice == 2) slytherin++;
            else if (choice == 3) gryffindor++;
            else if (choice == 4) hufflepuff++;
            else System.out.println("Invalid choice, skipping...");

            System.out.println();
        }
        int max = Math.max(Math.max(ravenclaw, slytherin), Math.max(gryffindor, hufflepuff));

        System.out.println("\n--- What House You are in NAAAAAAAAA ---");
        if (max == ravenclaw) {
            System.out.println(userName + ", You belong to Ravenclaw!!!!!!!");
        } else if (max == slytherin) {
            System.out.println(userName + ", You belong to Slytherin!!!!!!!");
        } else if (max == gryffindor) {
            System.out.println(userName + ", You belong to Gryffindor!!!!!!");
        } else {
            System.out.println(userName + ", You belong to Hufflepuff!!!!!!");
        }

        scanner.close();
    }

}
