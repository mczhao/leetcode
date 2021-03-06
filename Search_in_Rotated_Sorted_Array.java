public class Solution {
    public int search(int[] A, int target) {
        int n = A.length;
        if (n==0) return -1;
        int l = 0;
        int r = A.length - 1;
        while (l<=r) {
            int m = (l+r)/2;
            if (A[m]==target) return m;
            if (A[l]<=A[m]) {
                if ((A[l]<=target) && (target<A[m])) r = m - 1;
                else l = m + 1;
            } else {
                if ((A[m]<target) && (target<=A[r])) l = m + 1;
                else r = m - 1;
            }
        }
        return -1;
    }
}