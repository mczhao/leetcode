public class Solution {
    ArrayList<String> res = new ArrayList<String>();
    
    public void genPos(int pos, StringBuilder sb, int diff, int expect) {
        if (expect == 0) {
            if (diff==0) res.add(sb.toString());
        } else {
            if (diff<0) return;
            else if (diff>expect) return;
            else {
                sb.append("(");
                genPos(pos+1, sb, diff+1, expect-1);
                sb.setCharAt(sb.length()-1, ')');
                genPos(pos+1, sb, diff-1, expect-1);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    
    public ArrayList<String> generateParenthesis(int n) {
        res = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        genPos(0,sb,0,2*n);
        return res;
    }
}