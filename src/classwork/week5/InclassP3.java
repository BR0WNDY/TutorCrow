package classwork.week5;
/*
Practice 3: Find Minimum Value
Write a method:
public static int min (int[] arr)
Return the smallest integer in the array.
Test with:
int[] n = {5, 99, 10, 3, 100};
System.out.println( min (n));
Expected:
3
 */

public class InclassP3 {
    public static int min (int[] arr){
        int smallest_num = 999999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest_num){
                smallest_num = arr[i];
            }
        }
        return smallest_num;
    }

    public static void main(String[] args) {
        int[] n = {5, 99, 10, 3, 100};
        System.out.println(min(n));
    }
}
