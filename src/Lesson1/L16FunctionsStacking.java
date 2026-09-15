package Lesson1;

public class L16FunctionsStacking {
    static void main() {

        System.out.println(doubleit(plusfive(doubleit(10))));
        System.out.println(addtile("Potter"));
        System.out.println(makeEmailfromName("jamespotter"));
        System.out.println(addtile(makeEmailfromName("john")));
        System.out.println(addUnderScore("JamesPotter"));
        System.out.println(makeEmailfromName(addUnderScore(addtile("John"))));

        System.out.println("===========================");
        String initialname = "John";
        String adddtitle = addtile(initialname);
        String addunderscore = addUnderScore(adddtitle);
        String addemail = makeEmailfromName(addunderscore);
        System.out.println(addemail);
        System.out.println("===========================");
        String initialname1 = "Alice";
        System.out.println(initialname1);
        String adddtitle1 = addtile(initialname1);
        System.out.println(adddtitle1);
        String addunderscore1 = addUnderScore(adddtitle1);
        System.out.println(addunderscore1);
        String addemail1 = makeEmailfromName(addunderscore1);
        System.out.println(addemail1);
        String Lilly = concat("Hi" ,"1234");
        System.out.println(Lilly);
        String Ginny = addUnderScore(Lilly);
        System.out.println(Ginny);
        String Harry = concat(addemail1,Ginny);
        System.out.println(Harry);






    }
    static int doubleit(int x){
        return x * 2;
    }
    static int plusfive(int x){
        return x + 5;
    }
    static String addtile(String A){
        return "Mr." + A;
    }
    static String makeEmailfromName(String B){
        return B +"@gmail.com";
    }
    static String addUnderScore(String C){
        return "_" + C + "_";
    }
    static String concat(String A, String B){
        return A + "&&&&" + B;
    }
}
