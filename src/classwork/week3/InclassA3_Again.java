package classwork.week3;
import java.util.Scanner;
public class InclassA3_Again {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String[] name = username.split(",");
        String word1 = name[0];
        String word2 = name[1];
        String word3 = name[2];

        String wordx1 = word1.substring(0,3);
        String wordx2 = word2.substring(word2.length() - 3);
        String wordx3 = word3.substring(word3.length() - 2);
        System.out.println(wordx1+wordx2+wordx3);

    }
}
