package Lesson1;
import java.util.Arrays;
import java.util.Random;
public class L18_2DArray {
    //
    public static void main(String[] args) {
        // This is a 1D Array
        int[] myNumber = {1,3,5,7,9};
        System.out.println(myNumber[0]);
        System.out.println(myNumber[1]);
        System.out.println(myNumber[2]);
        System.out.println(myNumber[3]);
        System.out.println(myNumber[4]);
        System.out.println("==============================");
        //print all array
        for (int i = 0; i < myNumber.length; i++){
            System.out.println(myNumber[i]);;
        }
        //Print Array in String
        System.out.println("==============================");
        String[] students = {"Boom","Mike","John","Danny"};
        for (int i = 0; i<students.length;i++){
            System.out.println(students[i]);
        }
        System.out.println("==============================");
        for (int i = 0; i<students.length;i++){
            System.out.println("Students " + i + " = " +students[i]);
        }
        System.out.println("==============================");
        for (int i = 0; i <myNumber.length;i++){
            System.out.print(myNumber[i] + " ");
        }
        System.out.println("\n==============================");
        for (int i = 0; i <myNumber.length;i++){
            System.out.print(myNumber[i] + ", ");
        }
        System.out.println("\n==============================");
        System.out.print("[");
        for (int i = 0; i <myNumber.length;i++){
            System.out.print(myNumber[i] + ", ");
        }
        System.out.print("]");
        System.out.println("\n==============================");
        for (int i = 0; i <students.length;i++){
            System.out.print(students[i] + " ");
        }
        System.out.println("\n==============================");

        //create emty array
        int[] emtyArray = new int[100];

        System.out.println(emtyArray[0]);
        System.out.println(emtyArray[1]);
        System.out.println(emtyArray[99]);

        String[] emtyArray1 = new String[1000];
        System.out.println(emtyArray1[1]);
        System.out.println(emtyArray1[999]);


        // fill the emty array with random
        Random random = new Random();
        for (int i = 0; i < emtyArray.length;i++){
            emtyArray[i] = random.nextInt(0,1000);
        }
        for (int i = 0; i < emtyArray.length; i++){
            System.out.print(emtyArray[i] + " ");
        }
        System.out.println("\n==============================");

        // emtylist with 1000 Size fill with random 1 or 0
        //01010110101001010
        System.out.println("\n==============================");
        int[] practiceL18 = new int [1000];
        for (int i = 0; i < practiceL18.length;i++){
           practiceL18[i] = random.nextInt(2);
        }
        for (int i = 0; i < practiceL18.length;i++){
            System.out.print(practiceL18[i] + " ");
        }
        System.out.println("\n==============================");

        // emty list with 25 leangth , fill with radom numbert 10 - 20
        // [11,14,17,....,19]
        int[] practiceL18P2 = new int [25];
        for (int i = 10; i < practiceL18P2.length;i++){
            practiceL18P2[i] = random.nextInt(10, 21);
        }
        for (int i = 10; i < practiceL18P2.length;i++){
            System.out.print(practiceL18P2[i] + " ");
        }

        System.out.println("\n==============================");

        // 2D Array
        String[][] classrrom = {
                {"Boom","Mike","John","Danny"},
                {"Harry","Harmony","Pick","Hi"},
                {"Hello","Cat","Dog","Cow"}
        };
        System.out.println(classrrom[0][1]);
        System.out.println(classrrom[1][2]);
        System.out.println(classrrom[2][0]);
        System.out.println(classrrom[0][3]);
        System.out.println("\n==============================");
        //print all 2D Array
        //manual way
        for (int i = 0; i < classrrom.length; i++) {
            System.out.println(classrrom[i][0]);
            System.out.println(classrrom[i][1]);;
            System.out.println(classrrom[i][2]);
            System.out.println(classrrom[i][3]);
        }
        // WRONG way
        System.out.println("\n==============================");
        for (int i = 0; i < classrrom.length; i++) {
            System.out.println(classrrom[i][i]);
        }
        // the right way
        System.out.println("==============================");
        for (int i = 0; i < classrrom.length; i++) {
            for (int j = 0; j < classrrom[i].length; j++){
                System.out.println(classrrom[i][j]);
            }

        }
        System.out.println("\n ==============================");


        // print 2D Array Pretty
        System.out.println("\n==============================[2D ARRAY]");
        for (int i = 0; i < classrrom.length; i++) {
            for (int j = 0; j < classrrom[i].length; j++){
                System.out.print(classrrom[i][j] + " ");
            }
            // not outside of i loop and only outside J Loop
            System.out.println(" ");
        }
        System.out.println("\n==============================");
        char[][] board = {
                {'O','X','O'},
                {'X','O','O'},
                {'O','O','X'}
        };
        System.out.println("\n==============================");
       for (int i = 0; i < board.length;i++){
           for(int j = 0; j < board[i].length;j++){
               System.out.print(board[i][j] + " ");
           }
           System.out.println(" ");
       }
        System.out.println("\n==============================");
       char [][] nums = {
               {'0','0','0','1'},
               {'0','0','1','0'},
               {'0','0','0','0'},
        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
