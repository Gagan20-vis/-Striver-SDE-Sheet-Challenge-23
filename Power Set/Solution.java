import java.util.* ;
import java.io.*;
public class Solution {
    public static void solve(int ind,ArrayList<Integer> arr,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans){
        if(ind==arr.size()){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(arr.get(ind));
        solve(ind+1,arr,temp,ans);
        temp.remove(temp.size()-1);
        solve(ind+1,arr,temp,ans);
    }
    public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        solve(0,arr,new ArrayList<Integer>(),ans);
        return ans;
    }
}

