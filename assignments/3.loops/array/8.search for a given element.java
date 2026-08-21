import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) { System.out.println("Found at " + i); return; }
        System.out.println("Not Found");
    }
}
