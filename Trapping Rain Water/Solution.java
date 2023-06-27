import java.util.* ;
import java.io.*;
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        int left = 0,right = n-1;
        long res = 0,maxleft = 0,maxright = 0;
        while(left<=right){
            if(arr[left]<=arr[right]){
                if(arr[left]>=maxleft) maxleft = arr[left];
                else res += maxleft - arr[left];
                left++;
            }
            else{
                if(arr[right]>=maxright) maxright = arr[right];
                else res += maxright - arr[right];
                right--;
            }
        }
        return res;
    }
}
