import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int n) {
        // Write your code here.
        HashSet<Integer> st = new HashSet<>();
        int ans = 0;
        for(int i:arr) st.add(i);
        for(int i : arr){
            if(!st.contains(i-1)){
                int currStreak = 1;
                int curr_num = i;
                while(st.contains(curr_num+1)){
                    currStreak++;
                    curr_num+=1;
                }
                ans = Math.max(ans,currStreak);
            }
        }
        return ans;
    }
}