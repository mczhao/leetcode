public class Solution {
    private ArrayList<Integer> convert(String word) {
        int[] res = new int[26];
        for (int i=0; i<word.length(); i++) {
            res[word.charAt(i)-'a']++;   
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i=0; i<26; i++) {
            result.add(new Integer(res[i]));
        }
        return result;
    }
    
    public List<String> anagrams(String[] strs) {
        List<String> result = new LinkedList<String>();
        HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();
        HashSet<List<Integer>> hashSet2 = new HashSet<List<Integer>>();
        for (String str:strs) {
            ArrayList<Integer> signature = convert(str);
            if (!hashSet.contains(signature)) hashSet.add(signature);
            else hashSet2.add(signature);
        }
        for (String str:strs) {
            ArrayList<Integer> signature = convert(str);
            if (hashSet2.contains(signature)) result.add(str);
        }
        return result;
    }
}