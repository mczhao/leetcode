public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null) return 0;
        if (s.length() == 0) return 0;
        int p = s.length() - 1;
        while ((p>=0) && (s.charAt(p) == ' ')) p--;
        if (p<0) return 0;
        int e = p;
        while ((p>=0) && (s.charAt(p) != ' ')) p--;
        return (e-p);
    }
}