public class LargestMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int max = mat[0][0]; for (int[] row : mat) for (int x : row) if (x > max) max = x;
        System.out.println(max);
    }
}
