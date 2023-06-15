import java.util.*;

public class Solution {

    static class Pair{
        BinaryTreeNode<Integer> node;
        int num;
        Pair(BinaryTreeNode<Integer> root,int num){
            node = root;
            this.num = num;
        }
    }
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
        if(root==null) return new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        st.push(new Pair(root,1));
        while(!st.isEmpty()){
            Pair temp = st.pop();
            if(temp.num==1){
                pre.add(temp.node.data);
                temp.num++;
                st.push(temp);
                if(temp.node.left!=null) st.push(new Pair(temp.node.left,1));
            }
            else if(temp.num==2){
                in.add(temp.node.data);
                temp.num++;
                st.push(temp);
                if(temp.node.right!=null) st.push(new Pair(temp.node.right,1));
            }
            else post.add(temp.node.data);
        }
        ans.add(in);
        ans.add(pre);
        ans.add(post);
        return ans;
    }
}
