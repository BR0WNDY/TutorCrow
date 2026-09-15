package classwork.week3;
import java.util.Scanner;
public class InclassA3 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        // this for 1by1
    //    String name = scanner.nextLine();s
    //    String name1 = name.substring(0,3);
    //    System.out.println(name1);
    //    String lastname = name.substring(9,12);
    //    System.out.println(lastname);
    //    String id = name.substring(19,21);
    //    System.out.println(id);
    //    String result = name1 + lastname + id;
    //    System.out.println(result);
    // this array
        String username = scanner.nextLine();
        String[] usernameArray = username.split(",");
        String word1 = usernameArray[0];
        String word2 = usernameArray[1];
        String word3 = usernameArray[2];
//        System.out.println(word1 + word2 + word3);

        String wordx1 = word1.substring(0,3);
        String wordx2 = word2.substring(word2.length()-4);
        String wordx3 = word3.substring(5,7);
        System.out.println(wordx1+wordx2+wordx3);



    }
}
