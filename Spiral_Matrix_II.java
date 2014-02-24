public class Solution {
    boolean isValid(int r, int c, int[][] res) {
        if ((r<0) || (r>=res.length)) return false;
        if ((c<0) || (c>=res.length)) return false;
        if (res[r][c] != 0) return false;
        return true;
    }
    
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if (n==0) return res;
        int r = 0;
        int c = 0;
        int d[][] = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
        int di = 0;
        for (int i=1; i<=n*n; i++) {
            res[r][c] = i;
            if (i==n*n) break;
            while (!isValid(r+d[di][0], c+d[di][1], res)) {
                di = (di+1)%4;
            }
            r = r+d[di][0];
            c = c+d[di][1];
        }
        return res;
    }
}