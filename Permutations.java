public class Solution {
    ArrayList<ArrayList<Integer>> res;
    
    void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    
    void genPermute(int[] num, int level) {
        if (level==num.length-1) {
            ArrayList<Integer> subRes = new ArrayList<Integer>();
            for (int i=0; i<num.length; i++) subRes.add(new Integer(num[i]));
            res.add(subRes);
            return;
        }
        
        for (int i=level; i<num.length; i++) {
            swap(num, level, i);
            genPermute(num, level+1);
            swap(num, level, i);
        }
    }
    
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        res = new ArrayList<ArrayList<Integer>>();
        genPermute(num, 0);
        return res;
    }
}