public class Solution {
    public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length+1];
        int p = res.length - 1;
        digits[digits.length-1]++;
        int d = 0;
        for (int i=digits.length-1; i>=0; i--) {
            res[p] = (digits[i] + d)%10;
            d = (digits[i] + d)/10;
            p--;
        }
        if (d==0) {
            int[] newRes = Arrays.copyOfRange(res, 1, res.length);
            return newRes;
        } else {
            res[0] = d;
            return res;
        }
    }
}