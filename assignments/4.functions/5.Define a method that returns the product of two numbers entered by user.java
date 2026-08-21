import java.util.Scanner;

public class Main {

    static int product(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = product(a, b);

        System.out.println("Product = " + result);
    }
}
