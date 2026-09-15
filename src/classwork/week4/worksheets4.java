package classwork.week4;
import java.util.Arrays;
import java.util.Random;
public class worksheets4 {
    public static double mean (double[] arr,int a){
        int size = a;
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        double ans = result / size;
        return ans;
    }
    public static double mode (double[] arr, int n) {
        double com1 = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    com1++;
                }
            }
            if (num > max){
                max = num;
                com1 = arr[i];
            }
        }
        return com1;
    }
    public static double median(double[] arr, int n) {
        double[] Array = Arrays.copyOf(arr, n);
        Arrays.sort(Array);
        int mid = (n / 2);
        // N Devid by 2 and remider 1
        if (n % 2 == 1) {
            return Array[mid];
        } else {
            return  ( Array[mid - 1] + Array[mid] ) /2;
        }
    };
    public static void main(String[] args) {
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
