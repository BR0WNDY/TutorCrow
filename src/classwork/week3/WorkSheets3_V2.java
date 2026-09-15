package classwork.week3;
import java.util.Scanner;

public class WorkSheets3_V2 {
    public static boolean isPasswordValid(String password) {
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean haslower = false;
        boolean hasSEChar = false;
        boolean has8char = false;
        int digicount = 0;
        int uppercount = 0;
        int lowercount = 0;
        int symbolcount = 0;
        for (int i = 0; i < password.length(); i++) {
//            System.out.println(Userinput.charAt(i));
            if (Character.isDigit(password.charAt(i))) {
//                System.out.println("This is a Number");
                digicount += 1;
            }
            if (Character.isUpperCase(password.charAt(i))) {
//                System.out.println("This is a String");
                uppercount += 1;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                lowercount += 1;
            }
            if (password.charAt(i) == '#' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '/' || password.charAt(i) == '&' || password.charAt(i) == '_') {
                symbolcount += 1;
            }
        }

        if (digicount >= 1) {
            System.out.println("You have enogh of digits");
            hasDigit = true;
        } else {
            System.out.println("Please add digits to your password");
            hasDigit = false;
        }
        if (uppercount >= 1) {
            System.out.println("You have enoght a Uppercase Letter");
            hasUpper = true;
        } else {
            System.out.println("Please add Uppercase Letter to Your Password");
            hasUpper = false;
        }
        if (password.length() >= 8) {
            System.out.println("You have 8 Letters");
            has8char = true;
        } else {
            System.out.println("Please make a Password more than 8 letters");
            has8char = false;
        }
        if (symbolcount >= 1) {
            System.out.println("You have enough a Special Letters");
            hasSEChar = true;
        } else {
            System.out.println("Please add a Special Letter to Your Password");
            hasSEChar = false;
        }
        return has8char && hasDigit && haslower && hasSEChar && hasUpper;
    }
    public static void main() {
        //get userinpur get digits , uppercase , lowercase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String Userinput = scanner.nextLine();
        System.out.println(isPasswordValid(Userinput));

    }
}
