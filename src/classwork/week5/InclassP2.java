package classwork.week5;
/*
Practice 2: String to char array
Implement this method:
public static char[] toCharArray(String s)
Create a character array from a string
Test with:
String str = "Java";
System.out.println(Arrays.toString(toCharArray (s) ));
Expected:
[‘J’, ‘a’, ‘v’, ‘a’]
 */
public class InclassP2 {
    public static char[] toCharArray(String s){
        char[] names = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            names[i] = s.charAt(i);
        }
        return names;
    }
    public static void main (String[] args){
        String name = "Boom";
        char[] A = toCharArray(name);
        for (int i = 0; i < A.length; i++) {
            System.out.print("\'" + A[i] + "\', ");
        }
    }

}
