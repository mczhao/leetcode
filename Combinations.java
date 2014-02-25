public class Solution {
    ArrayList<ArrayList<Integer>> res;
    
    public void fill(ArrayList<Integer> subRes, int k, int s, int e) {
        if (k==0) res.add(subRes);
        else if (k>e-s+1) return;
        else {
            for (int i=s; i<=e; i++) {
                ArrayList<Integer> newRes = (ArrayList<Integer>)subRes.clone();
                newRes.add(new Integer(i));
                fill(newRes, k-1, i+1, e);
            }
        }
    }
    
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subRes = new ArrayList<Integer>();
        fill(subRes, k, 1, n);
        return res;
    }
}