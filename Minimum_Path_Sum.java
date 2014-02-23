public class Solution {
    public int minPathSum(int[][] grid) {
        if (grid.length == 0) return 0;
        int m = grid.length;
        if (grid[0].length == 0) return 0;
        int n = grid[0].length;
        int[][] minPath = new int[m][n];
        for (int i=m-1; i>=0; i--) {
            for (int j=n-1; j>=0; j--) {
                if (!((i==m-1) && (j==n-1))) {
                    minPath[i][j] = Math.min(i+1<m?minPath[i+1][j]:Integer.MAX_VALUE, j+1<n?minPath[i][j+1]:Integer.MAX_VALUE) + grid[i][j];
                } else {
                    minPath[i][j] = grid[i][j];
                }
            }
        }
        return minPath[0][0];
    }
}