public class Solution {
    public boolean search(int[] A, int target) {
        int n = A.length;
        if (n==0) return false;
        int l = 0;
        int r = n-1;
        while (l<=r) {
            int m = (l+r)/2;
            if (A[m]==target) return true;
            if (A[l]<A[m]) {
                if ((A[l]<=target) && (target<A[m])) r = m - 1;
                else l = m + 1;
            } else if (A[l]>A[m]) {
                if ((A[m]<target) && (target<=A[r])) l = m + 1;
                else r = m - 1;
            } else l++;
        }
        return false;
    }
}