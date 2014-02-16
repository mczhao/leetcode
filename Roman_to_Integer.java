public class Solution {
    public int romanToInt(String s) {
        int v[] = new int[26];
        v['I'-'A'] = 1;
        v['V'-'A'] = 5;
        v['X'-'A'] = 10;
        v['L'-'A'] = 50;
        v['C'-'A'] = 100;
        v['D'-'A'] = 500;
        v['M'-'A'] = 1000;
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            if ((s.charAt(i)=='V') || (s.charAt(i)=='L') || (s.charAt(i)=='D')) sum+=v[s.charAt(i)-'A'];
            else {
                if ((i+1<s.length()) && ((v[s.charAt(i+1)-'A']/v[s.charAt(i)-'A']==5) || (v[s.charAt(i+1)-'A']/v[s.charAt(i)-'A']==10))) sum-=v[s.charAt(i)-'A'];
                else sum+=v[s.charAt(i)-'A'];
            }
        }
        return sum;
    }
}