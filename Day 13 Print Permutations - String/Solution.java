import java.util.* ;
import java.io.*;
public class Solution {
    public static void solve(int ind,StringBuilder s,List<String> ans){
        if(ind==s.length()){
            ans.add(s.toString());
            return ;
        }
        for(int i = ind;i<s.length();i++){
            swap(s,ind,i);
            solve(ind+1,s,ans);
            swap(s,ind,i);
        }
    }
    public static void swap(StringBuilder s,int i,int j){
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }
    public static List<String> findPermutations(String s) {
        // Write your code here.
        List<String> ans = new ArrayList<>();
        solve(0,new StringBuilder(s),ans);
        return ans;
    }
}