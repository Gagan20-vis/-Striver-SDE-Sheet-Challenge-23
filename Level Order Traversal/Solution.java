import java.util.*;
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

    public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
        if(root==null) return new ArrayList<>();
        //Your code goes here
        Queue<BinaryTreeNode> queue = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size;i++){
                BinaryTreeNode curr = queue.poll();
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
                ans.add(curr.val);
            }
        }
        return ans;
    }

}