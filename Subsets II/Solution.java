import java.util.* ;
import java.io.*;
public class Solution {
    public static void solve(int ind,int[] arr,int n,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        for(int i = ind;i<n;i++) {
            if(i!=ind && arr[i] == arr[i-1]) continue;
            temp.add(arr[i]);
            solve(i+1,arr,n,temp,ans);
            temp.remove(temp.size() - 1);
        }
    }
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        solve(0,arr,n,new ArrayList<Integer>(),ans);
        return ans;
    }

}