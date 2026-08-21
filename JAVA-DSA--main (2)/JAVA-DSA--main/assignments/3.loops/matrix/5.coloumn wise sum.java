public class ColSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        for (int j = 0; j < mat[0].length; j++) {
            int sum = 0; for (int i = 0; i < mat.length; i++) sum += mat[i][j];
            System.out.println("Col " + j + " = " + sum);
        }
    }
}
