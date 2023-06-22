/*************************************************************

 Following is the Binary Tree Node structure:

 class TreeNode<T> {
 public T data;
 public BinaryTreeNode<T> left;
 public BinaryTreeNode<T> right;

 TreeNode(T data) {
 this.data = data;
 left = null;
 right = null;
 }
 }

 *************************************************************/

public class Solution {
    private static int solve(TreeNode<Integer> root,int[] max)
    {
        if(root == null) return 0;

        int lf = solve(root.left,max);
        int rh = solve(root.right,max);
        int count = lf+rh;

        max[0] = Math.max(max[0],count);

        return Math.max(lf,rh)+1;
    }
    public static int diameterOfBinaryTree(TreeNode<Integer> root) {
        // Write your code here.
        int[] max = new int[1];
        solve(root,max);
        return max[0];
    }
}