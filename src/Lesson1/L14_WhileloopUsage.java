package Lesson1;
import java.util.Scanner;
public class L14_WhileloopUsage {
    public static void main() {
        /// this is a simple program using while loop
        System.out.println("You can type anything in here !!!! \n This is my first program");
        System.out.println("Type 'Exit' to stop");
        boolean isRunning = true;
        while (isRunning){
            Scanner scanner = new Scanner(System.in);
            String userinput = scanner.nextLine();
            if (userinput.equals("exit")){
                isRunning = false;
            }
        }
        System.out.println("This Program is Ended");
    }
}
