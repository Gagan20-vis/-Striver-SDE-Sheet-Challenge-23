import java.util.* ;
import java.io.*;

public class Solution {

    public static int[] nextGreater(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]) st.pop();
            ans[i] = (st.isEmpty()) ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

}
