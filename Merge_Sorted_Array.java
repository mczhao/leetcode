public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int p = m+n-1;
        int p1 = m-1;
        int p2 = n-1;
        while ((p1>=0) || (p2>=0)) {
            if ((p2<0) || ((p1>=0) && (A[p1]>=B[p2]))) {
                A[p] = A[p1];
                p--;
                p1--;
            } else {
                A[p] = B[p2];
                p--;
                p2--;
            }
        }
    }
}