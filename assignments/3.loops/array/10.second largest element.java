public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 7};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > first) { second = first; first = x; }
            else if (x > second && x!= first) second = x;
        }
        System.out.println("Second Largest = " + second);
    }
}
