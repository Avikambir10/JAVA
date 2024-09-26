package End_Term;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void setmatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] rowArray = new int[n];
        int[] colArray = new int[m];
        Arrays.fill(rowArray, 1);
        Arrays.fill(colArray, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rowArray[i] = 0;
                    colArray[j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(rowArray[i] == 0 || colArray[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1},
                       {1, 0, 1},
                       {1, 1, 1}};

        setmatrix(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
