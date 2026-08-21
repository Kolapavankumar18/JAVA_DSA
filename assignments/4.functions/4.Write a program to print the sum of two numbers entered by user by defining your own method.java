import java.util.Scanner;
public class Main {
    static void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sum(a, b);
    }
}
