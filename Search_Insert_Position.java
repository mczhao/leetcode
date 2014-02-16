public class Solution {
    public int searchInsert(int[] A, int target) {
        int pos = Arrays.binarySearch(A, target);
        if (pos>=0) return pos;
        else return -(pos+1);
    }
}