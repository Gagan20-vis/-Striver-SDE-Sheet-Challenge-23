import java.util.HashMap;
public class Solution
{
    public static int uniqueSubstrings(String s)
    {
        //write your code here
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0,r = 0,n = s.length(),ans = 0;
        while(r<n){
            if(map.containsKey(s.charAt(r))) l = Math.max(map.get(s.charAt(r))+1,l);
            map.put(s.charAt(r), r);
            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}
