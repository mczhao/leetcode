public class Solution {
    public double pow(double x, int n) {
        boolean flag = true;
        if (n<0) {
            n = -n;
            flag = false;
        }
        double[] expValue = new double[64];
        expValue[0] = x;
        double sum = 1;
        for (int k = 0; (1L << k)<=n; k++) {
            if (((long)n & (1L << k)) != 0L) sum *= expValue[k];
            expValue[k+1] = expValue[k]*expValue[k];
        }
        if (flag) return sum;
        else return 1/sum;
    }
}