public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m==0) return false;
        int n = matrix[0].length;
        if (n==0) return false;
        int total = m*n;
        
        int low = 0;
        int high = m*n - 1;
        while ((low<m*n) && (high>=0) && (low<=high)) {
            int mid = (low+high)/2;
            if (matrix[mid/n][mid%n] == target) return true;
            else if (matrix[mid/n][mid%n] < target) low = mid+1;
            else high = mid - 1;
        }
        return false;
    }
}