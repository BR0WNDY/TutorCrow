package classwork.week3;

import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        String hehehaha = "abc123";
        String firstthreeletters = hehehaha.substring(0,3);
        System.out.println(firstthreeletters);

        String c12 = hehehaha.substring(2,5);
        System.out.println(c12);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        String output = name.substring(0,3);
        System.out.println(output);
    }
}
