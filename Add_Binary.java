public class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        int d = 0;
        String res = new String("");
        for (int i=0; i<Math.max(alen,blen); i++) {
            int aidx = alen - 1 - i;
            int bidx = blen - 1 - i;
            int sum = d;
            if (aidx >= 0) sum+=(a.charAt(aidx)-'0');
            if (bidx >= 0) sum+=(b.charAt(bidx)-'0');
            int lastd = sum % 2;
            d = sum / 2;
            res = ((char)(lastd + '0')) + res;
        }
        if (d==1) res = '1'+res;
        return res;
    }
}