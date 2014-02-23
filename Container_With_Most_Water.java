public class Solution {
    public int maxArea(int[] height) {
        if (height.length<=1) return 0;
        int p = 0;
        int q = height.length - 1;
        int maxCap = 0;
        while (p<q) {
            maxCap = Math.max(maxCap, Math.min(height[p],height[q])*(q-p));
            if (height[p]<height[q]) p++;
            else q--;
        }
        return maxCap;
    }
}