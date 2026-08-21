public class RowSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        for (int i = 0; i < mat.length; i++) {
            int sum = 0; for (int x : mat[i]) sum += x;
            System.out.println("Row " + i + " = " + sum);
        }
    }
}
