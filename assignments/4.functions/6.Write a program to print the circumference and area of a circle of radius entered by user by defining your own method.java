import java.util.Scanner;

public class Main {

    static double area(double r) {
        return Math.PI * r * r;
    }

    static double circumference(double r) {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.println("Area = " + area(r));
        System.out.println("Circumference = " + circumference(r));
    }
}
