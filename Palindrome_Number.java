public class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        if (x<10) return true;
        int l = 1;
        while (l<=x/10) l*=10;
        int r = 10;
        while (l>=10) {
            if (x/l != x%r) return false;
            x = (x%l)/r;
            l /= 100;
        }
        return true;
    }
}