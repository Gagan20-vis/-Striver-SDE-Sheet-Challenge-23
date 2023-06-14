import java.io.*;
import java.util.* ;

public class Solution {
    public static int findMajority(int[] nums, int n) {
        // Write your code here.
        int element=0,count=0;
        for(int i:nums)
            if(count==0){
                element = i;
                count = 1;
            }
            else if(i==element) count++;
            else count--;
        int count1 = 0;
        for(int i: nums) if(element==i) count1++;
        return (count1>n/2) ? element : -1;
    }
}