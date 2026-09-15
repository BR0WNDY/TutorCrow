package classwork.week2;
import java.util.Scanner;
public class worksheet2 {
    public static void main() {
        System.out.println("Hollow Sphere Volume Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Outer Radius : ");
        double outerRadius = scanner.nextDouble();
        System.out.println("Enter a Inner Radius : ");
        double InnerRadius = scanner.nextDouble();
        // 4.0 / 3.0 * Math.Pi * (Outer 3 - inner 3)
        double result = 4.0 / 3.0 * Math.PI * (Math.pow(outerRadius,3)-Math.pow(InnerRadius,3));
        System.out.printf("The Voloume of This Hollow Sphere is %.2f", result);

    }
}
