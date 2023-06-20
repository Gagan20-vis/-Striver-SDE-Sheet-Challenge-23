import java.util.*;

public class Solution
{
    public static void solve(int ind, ArrayList<Integer> arr, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans, int target, int sum) {
        if (sum == target) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = ind; i < arr.size(); i++) {
            if (i > ind && arr.get(i) == arr.get(i-1)) continue;
            if (sum + arr.get(i) > target) break;
            temp.add(arr.get(i));
            solve(i + 1, arr, temp, ans, target, sum + arr.get(i));
            temp.remove(temp.size() - 1);
        }
    }
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Collections.sort(arr);
        solve(0,arr,new ArrayList<Integer>(),ans,target,0);
        return ans;

    }
}