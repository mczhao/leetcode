public class Solution {
    public void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
    
    public void sortColors(int[] A) {
        int zp = 0;
        int tp = A.length - 1;
        int p = 0;
        
        while ((p<A.length) && (p<=tp)) {
            if (A[p] == 0) swap(A, p++, zp++); 
            else if (A[p] == 1) p++;
            else swap(A, p, tp--);
        }
    }
}