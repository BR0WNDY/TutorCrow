package classwork.week3;

public class StringFunctions2 {
    public static void main(String[]args) {
        //.replace()
        //.split()
        String goofystring = "5a4a3b2a1b";
        String newString = goofystring.replace("5","$");
        System.out.printf(newString);
        System.out.println("=============================");
        String customerName = "Mr. John Mike";
        String newName = customerName.replace("Mr.","Dr.");
        System.out.println(newName);
        System.out.println("=============================");
        String password = "Boom-123-potter";
        String newPassword = password.replace("-","_");
        System.out.println(newPassword);
        System.out.println("==============================");
        String students = "Boom,Crow,Mike,John";
        String[] StudentsArrray = students.split(",");
        System.out.println(StudentsArrray[2]);
        String greeting = "Hello-good-morning-everyone";
        String[] greetingArray = greeting.split("-");
        System.out.println(greetingArray[2]);
        String greeting2 = "Hello good morning everyone";
        String[] greetingarraynew = greeting2.split(" ");
        String word1 = greetingarraynew[0];
        String word2 = greetingarraynew[1];
        String word3 = greetingarraynew[2];
        String word4 = greetingarraynew[3];
        System.out.println(word1 + word2 + word3 + word4);

    }
}
