public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (num.length < 4) return result;
        Arrays.sort(num);
        for (int i=0; i<num.length; i++) {
            for (int j=i+1; j<num.length; j++) {
                for (int k=j+1; k<num.length; k++) {
                    int d = target - num[i] - num[j] - num[k];
                    if (k+1 < num.length) {
                        int idx = Arrays.binarySearch(num, k+1, num.length, d);
                        if (idx<0) continue;
                        else {
                            List<Integer> res = new LinkedList<Integer>();
                            res.add(num[i]);
                            res.add(num[j]);
                            res.add(num[k]);
                            res.add(num[idx]);
                            if (hashSet.contains(res)) continue;
                            else {
                                hashSet.add(res);
                                result.add(res);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}