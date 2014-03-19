public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if (triangle.size() == 0) return 0;
        int[] numArr = new int[triangle.size()];
        numArr[0] = triangle.get(0).get(0);
        for (int i=1; i<triangle.size(); i++) {
            for (int j=i; j>=0; j--) {
                numArr[j] = Math.min(j<i?numArr[j]:Integer.MAX_VALUE, j-1>=0?numArr[j-1]:Integer.MAX_VALUE) + triangle.get(i).get(j);
            }
        }
        int minTotal = Integer.MAX_VALUE;
        for (int i=0; i<triangle.size(); i++) {
            minTotal = Math.min(minTotal, numArr[i]);
        }
        return minTotal;
    }
}