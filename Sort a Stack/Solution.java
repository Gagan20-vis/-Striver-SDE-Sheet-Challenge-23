import java.util.* ;
import java.io.*;
public class Solution {
    public static void solve(Stack<Integer> stack,int ele){
        if(stack.isEmpty() || (!stack.isEmpty() && stack.peek()<ele)){
            stack.push(ele);
            return ;
        }
        int x = stack.pop();
        solve(stack,ele);
        stack.push(x);
    }

    public static void sortStack(Stack<Integer> stack) {
        // Write your code here.
        if(stack.isEmpty()) return ;
        int x = stack.pop();
        sortStack(stack);
        solve(stack,x);
    }

}