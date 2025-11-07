//Print Transpose of 2D-Matrix
public class practice3 {

    public static void printmatrix(int arr[][]) {
        // Print matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        int row = 2, col = 3;
        // Print original matrix
        System.out.println("Original Matrix is:");
        printmatrix(arr);
        // Create new matrix for transpose
        int transpose[][] = new int[col][row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];

            }

        }
        // Print transpose of matrix
        System.out.println("Transpose of Matrix is:");
        printmatrix(transpose);
    }
}
