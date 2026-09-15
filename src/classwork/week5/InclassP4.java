package classwork.week5;

import java.util.Scanner;
/*
Practice 4: Search in Array
Ask the user for a number. Search the number in this array:
int[] data = {4, 1, 7, 5, 9, 2};
Print:
• "Found at index X"
or
• "Not found"
 */
public class InclassP4 {

    public static void main(String[] args) {
        int[] data = {4,1,7,5,9,2};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Numbers to Search");
        int userInput = scanner.nextInt();
        boolean isfound = false;
        for (int i = 0; i < data.length; i++) {
            if (userInput == data[i]){
                System.out.println("Found at Index" + " " +i);
                isfound = true;
            }
        }
        if(isfound){

        }else{
            System.out.println("Not Found");
        }
    }
}
