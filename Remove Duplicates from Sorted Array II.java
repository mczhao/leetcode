public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length == 0) return 0;
        int currValue = A[0];
        int times = 1;
        int p = 1;
        for (int i=1; i<A.length; i++) {
            if (A[i] == currValue) {
                times++;
                if (times<=2) {
                    A[p] = A[i];
                    p++;
                }
            } else {
                A[p] = A[i];
                p++;
                currValue = A[i];
                times = 1;
            }
        }
        return p;
    }
}