public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = arr[0];
        for (int x : arr) if (x < min) min = x;
        System.out.println("Smallest = " + min);
    }
}
