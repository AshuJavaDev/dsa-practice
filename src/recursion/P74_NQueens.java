package recursion;

public class P74_NQueens {
     static void solveNQueens(int[] board, int row, int n) {
         if (row == n) {
             printBoard(board, n);
             return;
         }

         for (int col = 0; col < n; col++) {
             if (isSafe(board, row, col)) {
                 board[row] = col;
                 solveNQueens(board, row + 1, n);
             }
         }
     }

         static boolean isSafe ( int[] board, int row, int col){
             for (int i = 0; i < row; i++) {
                 if (board[i] == col) return false;
                 if (Math.abs(i - row) == Math.abs(board[i] - col)) {
                     return false;
                 }
             }
                    return true;
         }

         static void printBoard( int[] board, int n){
             for (int i = 0; i < n; i++) {
                 System.out.print(board[i] + " ");
             }
             System.out.println();
         }

            public static void main(String[] args)  {
                int n = 4;
                solveNQueens(new int[n], 0, n);
         }
     }

