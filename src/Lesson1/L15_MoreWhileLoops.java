package Lesson1;

import java.util.Scanner;

public class L15_MoreWhileLoops {
    public static void main(String[] args) {
        /// this is a simple program using while loop

        System.out.println("You can type anything in here !!!! \n This is my first program");
        System.out.println("Type 'Exit' to stop");

        //variables
        String catIcon = ("₍^. .^₎⟆");
        String owls = ("You got pass OWLS");
        String info = ("\"Type 'exit' to end the program \\n Type 'cat' to see a Cat \\n Type 'OWLS' you got a Pass\");");
        boolean isRunning = true;
        while (isRunning){
            Scanner scanner = new Scanner(System.in);
            String userinput = scanner.nextLine();
            if (userinput.equals("exit")){
                System.out.println("Are you sure ?? \n (yes) to exit the program \n (no) to continue");
                String userinput2 = scanner.nextLine();
                if (userinput2.equals("yes")){
                    isRunning = false;
                }else if (userinput2.equals("no")){
                    System.out.println("Continue to use it");
                    continue;
                }

            }else if(userinput.equals("cat")){
                System.out.println(catIcon);
            }else if(userinput.equals("OWLS")){
                System.out.println(owls);
            }else if (userinput.equals("INFO")){
                System.out.println(info);
            }
        }
        System.out.println("This Program is Ended");
    }

}

