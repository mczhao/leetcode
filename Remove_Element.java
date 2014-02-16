public class Solution {
    public int removeElement(int[] A, int elem) {
        Arrays.sort(A);
        int count = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i]==elem) {
                int j=i;
                while ((j<A.length) && (A[j]==elem)) {
                    j++;
                    count++;
                }
                for (int k=j; k<A.length; k++) {
                    A[i] = A[k];
                    i++;
                }
                break;
            }
        }
        return A.length - count;
    }
}