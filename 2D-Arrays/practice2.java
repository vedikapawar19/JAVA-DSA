//Print Sum of 2nd Row in 2D-Matrix
public class practice2 {
    public static void printSumofRow(int arr[][]) {
        int sum = 0;

        for (int j = 0; j < arr[0].length; j++) {

            sum = sum + arr[1][j];
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[][] = { { 2, 4, 8 }, { 11, 4, 3 }, { 3, 1, 8 } };
        printSumofRow(arr);
    }
}
