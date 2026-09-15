package classwork.week4;
import java.util.Scanner;
public class InclassA1 {
    public static int maxofTwo (int a, int b){
        if (a >b ){
            return a;
        }else{
            return b;
        }
    }
    public static int maxofthree (int a , int b, int c){
        return maxofTwo(c,maxofTwo(a,b));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = maxofthree(num1,num2,num3);
        System.out.println(max);
        scanner.close();
    }
}
