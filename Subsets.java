public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        int n = S.length;
        Arrays.sort(S);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<(1<<n); i++) {
            ArrayList<Integer> tRes = new ArrayList<Integer>();
            for (int j=0; j<n; j++) {
                if ((i & (1<<j)) != 0) tRes.add(S[j]);
            }
            res.add(tRes);
        }
        return res;
    }
}