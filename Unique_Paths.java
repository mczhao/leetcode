public class Solution {
    public int uniquePaths(int m, int n) {
        long total = 1;
        long div = 1;
        for (int i=1; i<n; i++) {
            total *= (m-1+i);
            total /= i;
        }
        return (int)total;
    }
}