public class Solution {
    int count;
    
    boolean isValid(int[] sol, int d, int p) {
        for (int i = 0; i < d; i++) {
            if (sol[i] == p) return false;
            if (d-i == Math.abs(sol[i]-p)) return false;
        }
        return true;
    }
    
    void dfs(int[] sol, int n, int depth) {
        if (depth == n) count++;
        for (int i=0; i<n; i++) {
            if (isValid(sol, depth, i)) {
                sol[depth] = i;
                dfs(sol, n, depth+1);
            }
        }
    }
    
    public int totalNQueens(int n) {
        count = 0;
        int[] solution = new int[n];
        dfs(solution, n, 0);
        return count;
    }
}