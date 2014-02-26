public class Solution {
    public int trap(int[] A) {
        int n = A.length;
        if (n==0) return 0;
        int l[] = new int[n];
        int r[] = new int[n];
        int lh = 0;
        for (int i=0; i<A.length; i++) {
            l[i] = lh;
            lh = Math.max(lh, A[i]);
        }
        int rh = 0;
        for (int i=A.length-1; i>=0; i--) {
            r[i] = rh;
            rh = Math.max(rh, A[i]);
        }
        int total = 0;
        for (int i=0; i<n; i++) total+=Math.max(0,Math.min(l[i],r[i]) - A[i]);
        return total;
    }
}