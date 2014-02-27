public class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int n = num.length;
        int res = num[0] + num[1] + num[2];
        int minDiff = Math.abs(res - target);
        for (int i=0; i<n-2; i++) {
            int start = i + 1;
            int end = n - 1;
            while (start < end) {
                int tRes = num[i]+num[start]+num[end];
                if (Math.abs(tRes-target) < minDiff) {
                    minDiff = Math.abs(tRes-target);
                    res = tRes;
                }
                if (num[i]+num[start]+num[end] > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return res;
    }
}