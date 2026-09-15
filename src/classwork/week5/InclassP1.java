package classwork.week5;

import java.util.Scanner;
/*
Ask the user to input 5 student scores, store them in an array, and
print the average.
 */
public class InclassP1 {
    public static double mean (double[] arr,int a){
        int size = a;
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        double ans = result / size;
        return ans;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[5];
        for (int i = 0; i < 5; i++){
            System.out.println("Enter one Student score");
            double userInput = scanner.nextDouble();
            scores[i] = userInput;
        }
        System.out.println("Student score are : ");
        for (int i = 0; i < scores.length;i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println(" ");
        double avg = mean(scores,scores.length);
        System.out.println(avg);
    }
}
