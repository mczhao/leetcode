public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int value = 0;
        for (int i=0; i<(1<<n); i++) {
            int base = 2;
            for (int j=0; j<n; j++) {
                if (i%base==base/2) value ^= (1<<j);
                base*=2;
            }
            res.add(new Integer(value));
        }
        return res;
    }
}