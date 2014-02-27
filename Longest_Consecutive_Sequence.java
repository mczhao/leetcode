public class Solution {
    public int longestConsecutive(int[] num) {
        if (num.length == 0) return 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=0; i<num.length; i++) {
            set.add(new Integer(num[i]));
        }
        int longest = 0;
        while (set.size() != 0) {
            int tLength = 1;
            Integer n = set.iterator().next();
            set.remove(n);
            int up = n+1;
            while (set.contains(new Integer(up))) {
                set.remove(new Integer(up));
                up++;
                tLength++;
            }
            int down = n-1;
            while (set.contains(new Integer(down))) {
                set.remove(new Integer(down));
                down--;
                tLength++;
            }
            longest = Math.max(longest, tLength);
        }
        return longest;
    }
}