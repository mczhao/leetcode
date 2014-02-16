public class Solution {
    public int removeDuplicates(int[] A) {
        int i=0;
        int j=0;
        if (A.length == 0) return 0;
        while (j<A.length) {
            while ((j<A.length) && (A[j]==A[i])) j++;
            if (j<A.length) A[++i] = A[j];
        }
        return i+1;
    }
}