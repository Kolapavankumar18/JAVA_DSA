public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int idx = 0;
        for (int x : arr) if (x!= 0) arr[idx++] = x;
        while (idx < arr.length) arr[idx++] = 0;
        for (int x : arr) System.out.print(x + " ");
    }
}
