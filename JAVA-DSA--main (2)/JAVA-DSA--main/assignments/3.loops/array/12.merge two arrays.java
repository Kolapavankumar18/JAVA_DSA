public class MergeArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3}, b = {4, 5};
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        for (int x : c) System.out.print(x + " ");
    }
}
