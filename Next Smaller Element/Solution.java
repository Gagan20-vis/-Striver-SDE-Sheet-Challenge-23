import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<Integer>(n);
        for(int i= n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr.get(i)) st.pop();
            ans.add((st.isEmpty()) ? -1 : st.peek());
            st.push(arr.get(i));
        }
        Collections.reverse(ans);
        return ans;
    }
}