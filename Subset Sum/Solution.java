import java.util.* ;
import java.io.*;
public class Solution {
    public static ArrayList<Integer> subsetSum(int nums[]) {
        // Write your code here..
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        helper(0,0,n,nums,ans);
        Collections.sort(ans);
        return ans;
    }

    public static void helper(int st,int sum,int size,int []nums,List<Integer> ans){
        if(st>=size){
            ans.add(sum);
            return;
        }
        helper(st+1,sum+nums[st],size,nums,ans);
        helper(st+1,sum,size,nums,ans);
    }

}