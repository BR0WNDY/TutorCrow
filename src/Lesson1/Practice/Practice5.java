
package Lesson1.Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Practice5 {
    public static int finMin(int[] arr){
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] Args) {
        int[] n = {5, 99, 10, 3, 100};
        System.out.println(finMin(n));
    }
}

