//Diagonal Sum Problem using 2D-Array(Microsoft,Amazon,Samsung)
public class diagonalsum {
    // Optimized Approach-Time complexity:O(n).
    public static int DiagonalSumOptimizeApr(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i <= matrix.length - 1; i++) {
            sum = sum + matrix[i][i]; // primary diagonal
            if (i != matrix.length - 1 - i) { // Condition is for Not calculate middle element two times in sum for odd
                                              // matrix
                sum = sum + matrix[i][matrix.length - 1 - i]; // secondary diagonal
            }
        }
        return sum;

    }

    // Brute-force Approach-Time complexity:O(n^2)
    public static int DiagonalSumBruteforceApr(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                if (i == j) {
                    sum += matrix[i][j]; // primary diagonal
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j]; // Secondary diagonal
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };
        System.out.println("Sum of Diagonals in 2D-Matrix by Optimized Approach:" + DiagonalSumOptimizeApr(matrix));
        System.out.println("Sum of Diagonals in 2D-Matrix by Brute-force Approach:" + DiagonalSumBruteforceApr(matrix));
    }
}
