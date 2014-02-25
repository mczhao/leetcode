public class Solution {
    public ArrayList<Integer> getRow(int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(new Integer(1));
        for (int i=0; i<k; i++) {
            res.add(new Integer(1));
            for (int j=i; j>=0; j--) {
                res.set(j, new Integer(res.get(j)+(j>0?res.get(j-1):0)));
            }
        }
        return res;
    }
}