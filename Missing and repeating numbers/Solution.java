import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
            // Write your code here
            //S - Sn which will == x-y
            //S2 - S2N which will == x+y
            long SN = (n * (n+1))/2;
            long S2N = (n * (n+1) * (2*n+1))/6;
            long S = 0,S2 = 0;
            for(int i = 0;i<n;i++){
                S += arr.get(i);
                S2 += (long) arr.get(i) * (long) arr.get(i);
            }
            long val1 = S - SN;      //x-y
            long val2 = S2 - S2N;    //x+y
            val2 /= val1;
            long x = (val1+val2)/2;
            long y = x - val1;
            int[] ans = new int[2];
            ans[0] = (int) y;
            ans[1] = (int) x;
            return ans;
        }

        //for 10/11 test case
        BigInteger sumofnNum = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n + 1)).divide(BigInteger.valueOf(2));
        BigInteger sumofarr = BigInteger.ZERO;
        BigInteger sumofsqnum = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n + 1)).multiply(BigInteger.valueOf(2 * n + 1)).divide(BigInteger.valueOf(6));
        BigInteger sumofsqarr = BigInteger.ZERO;
        int m = 0;
        int r = 0;

        for (int e : arr) {
            BigInteger bigE = BigInteger.valueOf(e);
            sumofarr = sumofarr.add(bigE);
            sumofsqarr = sumofsqarr.add(bigE.multiply(bigE));
        }

        BigInteger sub = sumofarr.subtract(sumofnNum);
        BigInteger sum = sumofsqarr.subtract(sumofsqnum).divide(sub);

        r = sub.add(sum).divide(BigInteger.valueOf(2)).intValue();
        m = sum.subtract(sub).divide(BigInteger.valueOf(2)).intValue();

        return new int[]{m, r};
    }
}