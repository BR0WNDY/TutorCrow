package Lesson1;

public class L9_FormatPrint {
    public static void main(String[] args) {
        String name = "John";
        int age = 43;
        double weight = 67.4;

        System.out.printf("This person's name is %s , and he is %d years old. His weight is %f \n\n",name,age,weight);

        double height = 123.4567890;
        System.out.printf("My Height is %.2f" , height);
    }
}
