package classwork.week3;

public class practice_worksheet3 {
    public static void main() {
        boolean test1 = isPasswordValid("abc1234");
        System.out.println(test1);
        boolean test2 = isPasswordValid("ABCde123Q@");
        System.out.println(test2);
    }
    public static boolean isPasswordValid(String password){
            boolean has8chracter = false;
            boolean hasUpperCase = false;
            boolean hasdigit = false;
            boolean hasSymbol = false;

            if (password.length() >= 8){
                has8chracter = true;
            }

            for (int i = 0; i< password.length();i++){
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)){
                    hasUpperCase = true;
                }
                if (Character.isDigit(ch)){
                    hasdigit = true;
                }
                if (ch == '_'|| ch == '@'||ch == '#'||ch == '$'||ch == '/' ||ch =='&'){
                    hasSymbol = true;
                }
            }
        boolean finalresult = has8chracter && hasUpperCase && hasSymbol && hasdigit;
            return finalresult;
    }
}
