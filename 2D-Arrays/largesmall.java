//Finding Largest and smallest Element in 2D matrix

import java.util.*;

public class largesmall {
    public static void FindLargeSmall(int matrix[][]) {
        int Largest = Integer.MIN_VALUE; // store minimum value in largest variable
        int Smallest = Integer.MAX_VALUE; // store maximum value in smallest variable
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Largest = Math.max(Largest, matrix[i][j]);
                Smallest = Math.min(Smallest, matrix[i][j]);
            }
        }
        System.out.println("Largest number in matrix:" + Largest);
        System.out.println("Smallest number in matrix:" + Smallest);

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        // input
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        FindLargeSmall(matrix);

    }
}
