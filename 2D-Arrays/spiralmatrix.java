//Spiral Matrix Problem-Using 2D -Array
//Conditions used for matrix-n*n,m*n,odd matrix

public class spiralmatrix {
    public static void printspiral(int matrix[][]) {
        int start_row = 0;
        int end_row = matrix.length - 1;
        int start_col = 0;
        int end_col = matrix[0].length - 1; // For column take length of first row
        while (start_row <= end_row && start_col <= end_col) {
            // top border
            for (int i = start_col; i <= end_col; i++) {
                System.out.print(matrix[start_row][i] + " ");
            }
            // right border
            for (int j = start_row + 1; j <= end_row; j++) {
                System.out.print(matrix[j][end_col] + " ");
            }
            // bottom border
            for (int i = end_col - 1; i >= start_col; i--) {
                if (start_row == end_row) {
                    break;
                }
                System.out.print(matrix[end_row][i] + " ");
            }
            // left border
            for (int j = end_row - 1; j >= start_row + 1; j--) {
                if (start_col == end_col) {
                    break;
                }
                System.out.print(matrix[j][start_col] + " ");
            }
            // After printing first loop then increase and decrease the row and column
            start_row++;
            end_row--;
            start_col++;
            end_col--;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int matrix[][] = { { 2, 4, 6, 16, 17 },
                { 1, 3, 5, 18, 19 },
                { 7, 8, 9, 20, 21 },
                { 10, 11, 12, 22, 23 },
                { 13, 14, 15, 24, 25 }

        };

        printspiral(matrix);

    }
}
