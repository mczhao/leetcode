public class Solution {
    public int reverse(int x) {
        boolean isNeg = false;
        if (x<0) { isNeg = true; x = -x; }
        int res = 0;
        while (x!=0) {
            res = res*10 + x%10;
            x /= 10;
        }
        if (isNeg) return -res;
        else return res;
    }
}