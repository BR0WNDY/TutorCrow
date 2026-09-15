package Lesson1;

public class L4_TypeChanges {
    public static void main() {
        int myFirstNumber = 20;
        int mySecondNumber = 40;
        System.out.println(myFirstNumber + 5);
        //This is how to convert int to string = String.valueOf()
        String firstNumberString = String.valueOf(myFirstNumber);
        System.out.println(firstNumberString + 5);

        //This is How to convert String to int Interger.parseInt()
        String rawUserAge = "19";
        int userAge = Integer.parseInt(rawUserAge);
        System.out.println(userAge + 5);


    }
}
