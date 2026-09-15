package classwork.week3;

public class LoopingThoughAString {
    public static void main(String[] Args){
        String goofyAhhhhh = "abc123";
        char b = goofyAhhhhh.charAt(1);
        System.out.println(b);
        char c = goofyAhhhhh.charAt(2);
        System.out.println(c);
        char A2 = goofyAhhhhh.charAt(4);
        System.out.println(A2);

        System.out.println("==========================");
        for (int i = 0; i < goofyAhhhhh.length(); i++){
            System.out.println(goofyAhhhhh.charAt(i));
            if (goofyAhhhhh.charAt(i) == 'b'){
                System.out.println("This is B");
            }
            if (Character.isDigit(goofyAhhhhh.charAt(i))){
                System.out.println("This is a Number");

            }
        }
    }

}
