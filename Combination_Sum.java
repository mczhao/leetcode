public class Solution {
    ArrayList<ArrayList<Integer>> res;
    
    void dfs(int[] candidates, int[] counter, int target, int p) {
        if (target == 0) {
            ArrayList<Integer> subRes = new ArrayList<Integer>();
            for (int i=0; i<counter.length; i++) {
                for (int j=0; j<counter[i]; j++) {
                    subRes.add(new Integer(candidates[i]));
                }
            }
            res.add(subRes);
            return;
        } else if (target < 0) return;
        else if (p>=candidates.length) return;
        else {
            for (int i=0; candidates[p]*i<=target; i++) {
                counter[p] = i;
                dfs(candidates, counter, target - candidates[p]*i, p+1);
            }
            counter[p] = 0;
        }
    }
    
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        res = new ArrayList<ArrayList<Integer>>();
        int[] counter = new int[candidates.length];
        dfs(candidates, counter, target, 0);
        return res;
    }
}