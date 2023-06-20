import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;end--;
        }
        return true;
    }
    public static void solve(int ind,String s,List<String> temp,List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = ind; i< s.length();i++){
            if(isPalindrome(s,ind,i)){
                temp.add(s.substring(ind, i+1));
                solve(i+1,s,temp,ans);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static List<List<String>> partition(String s) {
        // Write your code here.
        List<List<String>> ans = new ArrayList<>();
        solve(0,s,new ArrayList<String>(),ans);
        return ans;
    }
}