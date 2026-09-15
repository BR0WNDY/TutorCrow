package classwork.week5;

import java.util.List;

public class InClassP5 {
    public static void main(String[] args) {
        int[] ListArray = {1,2,3,4,5};
        int[] reversedArray = new int[ListArray.length];
        for (int i = ListArray.length-1, j=0; i>=0 ;i--,j++) {
            reversedArray[j] = ListArray[i];
        }
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
