public class Solution {
    public boolean canJump(int[] A) {
        if (A.length == 0) return false;
        int n = 0;
        for (int i=0; i<=n; i++) {
            n = Math.max(n, i+A[i]);
            if (n>=A.length-1) return true;
        }
        return false;
    }
}