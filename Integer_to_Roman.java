public class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        map.put(new Integer(1), new Character('I'));
        map.put(new Integer(5), new Character('V'));
        map.put(new Integer(10), new Character('X'));
        map.put(new Integer(50), new Character('L'));
        map.put(new Integer(100), new Character('C'));
        map.put(new Integer(500), new Character('D'));
        map.put(new Integer(1000), new Character('M'));
        int base = 10000;
        StringBuilder sb = new StringBuilder();
        while (num!=0) {
            base/=10;
            int v = num/base;
            num%=base;
            if (v==0) continue;
            else if ((v>=1) && (v<=3)) {
                for (int i=0; i<v; i++) sb.append(map.get(new Integer(base)));
            } else if (v==4) {
                sb.append(map.get(new Integer(base)));
                sb.append(map.get(new Integer(base*5)));
            } else if (v==5) {
                sb.append(map.get(new Integer(base*5)));
            } else if ((v>=6) && (v<=8)) {
                sb.append(map.get(new Integer(base*5)));
                for (int i=5; i<v; i++) sb.append(map.get(new Integer(base)));
            } else {
                sb.append(map.get(new Integer(base)));
                sb.append(map.get(new Integer(base*10)));
            }
        }
        return sb.toString();
    }
}