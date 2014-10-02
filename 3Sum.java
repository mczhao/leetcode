public class Solution {
    private boolean equal(List<Integer> a, List<Integer> b) {
        for (int i=0; i<3; i++) {
            if (!a.get(i).equals(b.get(i))) return false;
        }    
        return true;
    }
    
    public List<List<Integer>> threeSum(int[] num) {
        HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (num.length < 3) return result;
        Arrays.sort(num);
        for (int i=0; i<num.length; i++) {
            for (int j=i+1; j<num.length; j++) {
                if (j+1<num.length) {
                    int idx = Arrays.binarySearch(num, j+1, num.length, 0-num[i]-num[j]);
                    if (idx<0) continue;
                    else {
                        List<Integer> intList = new LinkedList<Integer>();
                        intList.add(new Integer(num[i]));
                        intList.add(new Integer(num[j]));
                        intList.add(new Integer(num[idx]));
                        if (hashSet.contains(intList)) continue;
                        else {
                            hashSet.add(intList);
                            result.add(intList);
                        }
                    }
                }
            }
        }
        return result;
    }
}