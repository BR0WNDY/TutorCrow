package classwork.week3;

public class inclassA2 {
    public static void main(String[]args) {
        String str = "a-b-c-d";
        String str1 = str.replace("-",",");
        System.out.println(str1);

        String[] str2 = str.split("-");
        System.out.println(str2[0]);
     }
}
