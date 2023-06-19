import java.util.Stack;
public class Solution {
    public static boolean isMatch(char a,char b){
        if(a=='{' && b=='}') return true;
        else if(a=='[' && b==']') return true;
        else if(a=='(' && b==')') return true;
        else return false;
    }
    public static boolean isValidParenthesis(String str) {
        // Write your code here.
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='[' || ch=='(' || ch=='{') st.push(ch);
            else{
                if(!st.isEmpty()){
                    if(isMatch(st.peek(), ch) )st.pop();
                    else return false;
                }
                else return false;
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}