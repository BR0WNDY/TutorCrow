package Lesson1;
import java.util.Scanner; // Need to text user input
public class L2_UserINPUT {
    public static void main() {
        System.out.println("Hi");

        Scanner myscanner = new Scanner(System.in);
        // String input
        System.out.println("Please Enter your name : ");
        String userName = myscanner.nextLine();
        System.out.println("Hello" + userName);

        //Number input
        System.out.println("Please Enter your age : ");
        int userAge = myscanner.nextInt();
        System.out.println("Your age is : " + userAge);

        System.out.println("please confirm your name is " + userName + " and your age is "+ userAge);

    }
}
