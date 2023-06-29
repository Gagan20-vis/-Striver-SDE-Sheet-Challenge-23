import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static int subarraysXor(ArrayList<Integer> arr, int k) {
        // Write your code here.
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int cnt = 0,xr = 0;
        for(int i : arr){
            xr = xr ^ i;
            int x= xr^k;
            if (map.containsKey(x)) {
                cnt += map.get(x);
            }
            if (map.containsKey(xr)) {
                map.put(xr, map.get(xr) + 1);
            } else
                map.put(xr, 1);
        }
        return cnt;
    }
}