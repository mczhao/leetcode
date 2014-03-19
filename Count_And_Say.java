public class Solution {
    String Say(String str) {
        StringBuilder sb = new StringBuilder();
        int c = str.charAt(0);
        int num = 1;
        int p = 1;
        while (p < str.length()) {
            if (str.charAt(p) == c) num++;
            else {
                sb.append(String.valueOf(num));
                sb.append(c-'0');
                c = str.charAt(p);
                num = 1;
            }
            p++;
        }
        sb.append(String.valueOf(num));
        sb.append(c-'0');
        return sb.toString();
    }
    
    public String countAndSay(int n) {
        String res = "1";
        for (int i=1; i<n; i++) {
            res = Say(res); 
        }
        return res;
    }
}