package ClassWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralTraversal {

    public static List<Integer> spiralOrder(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        int top = 0, left = 0;
        int bottom = arr.length -1, right = arr[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(arr[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(arr[bottom][i]);
                }bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(arr[i][left]);
                }left++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get matrix dimensions from the user
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Input the matrix elements from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Perform spiral order traversal
        List<Integer> spiralOrder = spiralOrder(matrix);
        System.out.println("Spiral Order: " + spiralOrder);
    }
}
