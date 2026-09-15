package classwork.week3;
import java.util.Scanner;
public class InclassA4 {
    public static void main() {
        //get userinpur get digits , uppercase , lowercase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String Userinput = scanner.nextLine();
        int digicount = 0;
        int uppercount = 0;
        int lowercount = 0;
        for (int i = 0; i < Userinput.length(); i++){
            System.out.println(Userinput.charAt(i));
            if (Character.isDigit(Userinput.charAt(i))){
                System.out.println("This is a Number");
                digicount += 1;
            }
            if (Character.isUpperCase(Userinput.charAt(i))){
//                System.out.println("This is a String");
                 uppercount += 1;
            }
            if (Character.isLowerCase(Userinput.charAt(i))){
                lowercount += 1;
            }
        }
        System.out.println("Total Number of Digits in the String " + digicount);
        System.out.println("Total Upper Case of String is " + uppercount);
        System.out.println("Total Lower Case of String is " +lowercount);
    }
}
