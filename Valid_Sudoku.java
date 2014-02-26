public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rowVec[][] = new boolean[9][9];
        boolean colVec[][] = new boolean[9][9];
        boolean squareVec[][] = new boolean[9][9];
        
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (board[i][j] == '.') continue;
                else {
                    int num = board[i][j] - '1';
                    if (rowVec[i][num]) return false;
                    else rowVec[i][num] = true;
                    if (colVec[j][num]) return false;
                    else colVec[j][num] = true;
                    if (squareVec[(i/3)*3+j/3][num]) return false;
                    else squareVec[(i/3)*3+j/3][num] = true;
                }
            }
        }
        return true;
    }
}