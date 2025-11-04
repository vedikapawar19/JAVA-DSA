//Search in Sorted Matrix-Use Staircase search(rowwise sorted,columnwise sorted)
//Time complexity-O(n+m)when matrix is in rectangular form and O(n)when matrix is in square form(n=m)
//Ask in Adobe,Oracle
public class SearchinMatrix {
    // Start search from top right corner
    public static boolean StaircaseSearch1(int matrix[][], int key) {
        int row = 0, col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key is found at index:" + "(" + row + "," + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key is not present");
        return false;

    }

    // Start search from bottom left corner
    public static boolean StaircaseSearch2(int matrix[][], int key) {
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix.length) {
            if (matrix[row][col] == key) {
                System.out.println("Key is found at index:" + "(" + row + "," + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("key is not present");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 30;
        StaircaseSearch1(matrix, key);
        StaircaseSearch2(matrix, key);
    }
}
