//Print the Total count of number 7 present in 2D-Matrix.
public class practice1 {
    public static void printNumof7(int arr[][], int num) {
        int sumofcount = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[0].length - 1; j++) {
                if (arr[i][j] == num) {
                    sumofcount++;
                }
            }
        }
        System.out.println(sumofcount);
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        int num = 7;
        printNumof7(arr, num);

    }
}
