public class Solution {
    public boolean isValid(String s) {
        if (s==null) return true;
        if (s.length() == 0) return true;
        LinkedList<Character> stack = new LinkedList<Character>();
        for (int i=0; i<s.length(); i++) {
            if (stack.size() == 0) stack.addLast(new Character(s.charAt(i)));
            else {
                if ((stack.getLast() == '(') && (s.charAt(i)==')')) stack.removeLast();
                else if ((stack.getLast() == '[') && (s.charAt(i)==']')) stack.removeLast();
                else if ((stack.getLast() == '{') && (s.charAt(i)=='}')) stack.removeLast();
                else stack.addLast(new Character(s.charAt(i)));
            }
        }
        if (stack.size() == 0) return true;
        else return false;
    }
}