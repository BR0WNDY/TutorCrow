package classwork.week4Crow;

import java.util.Arrays;
import java.util.Random;

public class worksheet4 {
    public static double mean(double[] arr, int n) {
        // mean = average = total divided by size
        int size = n;
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        double result = total / size;
        return result;
    }

    public static double mode(double[] arr, int n) {
        // mode = most common number in the array
        double mostCommon = arr[0];
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostCommon = arr[i];
            }
        }
        return mostCommon;
    }

    public static double median(double[] arr, int n) {
        double[] sortedArray = Arrays.copyOf(arr, n);
        Arrays.sort(sortedArray);

        int middle = (n / 2);

        if (n % 2 == 1) {
            return sortedArray[middle];
        } else {
            return  ( sortedArray[middle - 1] + sortedArray[middle] ) /2;
        }
    }

    public static void main(String[] args) {
        // testing
//        double[] myArray1 = {1.2, 5.4, 1.5, 0.9, 1.5};
//        System.out.println(mean(myArray1, myArray1.length));
//
//        System.out.println(mode(myArray1, myArray1.length));
//
//        double[] myArray2 = {5, 4, 3, 2, 1, 7, };
//        System.out.println(median(myArray2, myArray2.length));

        double[] worksheet4 = new double[100];
        Random random = new Random();
        for (int i = 0; i < worksheet4.length; i++) {
            worksheet4[i] = random.nextInt(101);
        }
        for (int i = 0; i < worksheet4.length; i++) {
            System.out.print(worksheet4[i] + " ");

        }

        System.out.println("\n");

        System.out.println(mean(worksheet4, worksheet4.length));
        System.out.println(median(worksheet4, worksheet4.length));
        System.out.println(mode(worksheet4, worksheet4.length));

    }
}
