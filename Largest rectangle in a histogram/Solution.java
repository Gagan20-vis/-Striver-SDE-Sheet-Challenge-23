import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static int[] nextSmaller(ArrayList<Integer> heights){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.size()];
        for(int i = heights.size()-1;i>=0;i--){
            while(!st.isEmpty() && heights.get(st.peek())>=heights.get(i)) st.pop();
            ans[i] = (st.isEmpty()) ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }
    public static int[] prevSmaller(ArrayList<Integer> heights){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[heights.size()];
        for(int i = 0;i<heights.size();i++){
            while(!st.isEmpty() && heights.get(st.peek())>=heights.get(i)) st.pop();
            ans[i] = (st.isEmpty()) ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }
    public static int largestRectangle(ArrayList < Integer > heights) {
        // Write your code here.
        int[] next = nextSmaller(heights);
        int[] prev = prevSmaller(heights);
        int Area = Integer.MIN_VALUE;
        for(int i = 0;i<heights.size();i++){
            if(next[i]==-1) next[i] = next.length;
            Area = Math.max(Area, heights.get(i)*(next[i]-prev[i]-1));
        }
        return Area;
    }
}