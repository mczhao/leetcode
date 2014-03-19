public class Solution {
    public int searchDouble(int[] A, int low, int high, double target) {
        if (low == high) return low;
        else {
            int mid = (low+high)/2;
            if (target <= A[mid]) return searchDouble(A, low, mid, target);
            else return searchDouble(A, mid+1, high, target);
        }
    }
    
    public int[] searchRange(int[] A, int target) {
        if (A.length == 0) return new int[]{-1, -1};
        double targetL = target - 0.5;
        int posL = searchDouble(A, 0, A.length - 1, targetL);
        int resL;
        if (A[posL]==target) resL = posL;
        else if ((A[posL]<target) && (posL+1<A.length) && (A[posL+1] == target)) resL = posL+1;
        else resL = -1;
        
        double targetR = target + 0.5;
        int posR = searchDouble(A, 0, A.length - 1, targetR);
        int resR;
        if (A[posR]==target) resR = posR;
        else if ((A[posR]>target) && (posR-1>=0) && (A[posR-1] == target)) resR = posR - 1;
        else resR = -1;
        return new int[]{resL, resR};
    }
}