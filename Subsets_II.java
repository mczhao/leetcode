class Node {
    int num;
    int t;

    public Node(int num, int t) {
        this.num = num;
        this.t = t;
    }
}

public class Solution {
    ArrayList<ArrayList<Integer>> res;
    
    public void dfs(ArrayList<Node> nodeList, ArrayList<Integer> tRes, int p) {
        if (p==nodeList.size()) res.add(tRes);
        else {
            for (int i=0; i<=nodeList.get(p).t; i++) {
                ArrayList<Integer> newRes = (ArrayList<Integer>)tRes.clone();
                for (int j=0; j<i; j++) newRes.add(new Integer(nodeList.get(p).num));
                dfs(nodeList, newRes, p+1);
            }
        }
    }
    
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        res = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        ArrayList<Node> nodeList = new ArrayList<Node>();
        for (int i=0; i<num.length; i++) {
            if (nodeList.size() == 0) {
                nodeList.add(new Node(num[i], 1));
            } else {
                if (nodeList.get(nodeList.size()-1).num == num[i]) nodeList.get(nodeList.size()-1).t++;
                else nodeList.add(new Node(num[i], 1));
            }
        }
        ArrayList<Integer> tRes = new ArrayList<Integer>();
        dfs(nodeList, tRes, 0);
        return res;
    }
}