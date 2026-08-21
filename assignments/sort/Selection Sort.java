public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2};

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

Output:
1 2 3 5 8
