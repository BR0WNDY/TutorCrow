package Lesson1.Practice;
import java.util.Scanner;
public class Practice2 {
    public static void main() {
        System.out.println("Enter your Score : ");
        Scanner myscanner = new Scanner(System.in);
        int score = myscanner.nextInt();
        if (score >= 50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
