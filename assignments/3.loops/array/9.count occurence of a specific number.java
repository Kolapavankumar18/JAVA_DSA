public class CountOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 4};
        int num = 2, count = 0;
        for (int x : arr) if (x == num) count++;
        System.out.println("Count = " + count);
    }
}
