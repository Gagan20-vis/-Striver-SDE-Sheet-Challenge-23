public class Solution
{
    public static String reverseString(String s)
    {
        //Write your code here
        int left = 0,right = s.length()-1;
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        while(left <= right){
            char ch = s.charAt(left);
            if(ch != ' ') temp.append(ch);
            else if(ch == ' '){
                if(temp.length()>0){
                    ans.insert(0,temp.toString()+" ");
                    temp.setLength(0);
                }
            }
            left++;
        }
        if(temp.length()>0) ans.insert(0,temp.toString()+" ");
        return ans.toString().trim();
    }
}
