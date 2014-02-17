public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (numRows == 0) return res;
        ArrayList<Integer> prevRow = new ArrayList<Integer>();
        prevRow.add(new Integer(1));
        res.add(prevRow);
        if (numRows == 1) return res;
        for (int j=1; j<numRows; j++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int i=0; i<prevRow.size()+1; i++) {
                row.add(new Integer((i<prevRow.size()?prevRow.get(i):0)+(i-1>=0?prevRow.get(i-1):0)));
            }
            prevRow = row;
            res.add(prevRow);
        }
        return res;
    }
}