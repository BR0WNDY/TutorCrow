package Lesson1.Practice;

public class Practice3 {
    public static void main() {
        for (int i = 2 ; i < 6; i++){
            System.out.println(i);
        }
        System.out.println("==============");
        for (int j = 10 ; j < 20; j=j+3){
            System.out.println(j);
        }
        System.out.println("===============");
        String word = "B";
        for (int k = 0;k < 4; k++){
            word = word + "C" + "E";
            System.out.println(word);
        }
        System.out.println("==================");
        System.out.println("Count Down Starts !!!!!!");
        for (int a = 5; a > 0;a--){
            System.out.println(a);
        }
        System.out.println("Gooooooo");
        System.out.println("=========");
    }
}
