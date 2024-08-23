package BLIND75;

import java.util.Scanner;
//wrong
public class WordSearch {
    static boolean[][] vis;

    public static boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((word.charAt(0) == board[i][j]) && search(i, j, 0, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean search(int i, int j, int index, char[][] board, String word) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || vis[i][j]
                || word.charAt(index) != board[i][j]) {
            return false;
        }
        vis[i][j] = true;
        if (    search(i + 1, j, index + 1, board, word) ||
                search(i - 1, j, index + 1, board, word) ||
                search(i, j + 1, index + 1, board, word) ||
                search(i, j - 1, index + 1, board, word)
        ) {
            return true;
        }
        vis[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[][] board = new char[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        sc.close();
        boolean result = exist(board, word);
        System.out.println(result);
    }
}
