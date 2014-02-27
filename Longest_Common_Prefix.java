public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return new String();
        String res = new String();
        int p = 0;
        char c = 'a';
        while (true) {
            for (int i=0; i<strs.length; i++) {
                if (p>=strs[i].length()) return res;
                if (i==0) c = strs[0].charAt(p);
                else {
                    if (strs[i].charAt(p)!=c) return res;
                }
            }
            res = res+c;
            p++;
        }
    }
}