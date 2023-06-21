/*****************************************************************

 Following is the representation for the Binary Tree Node:

 class BinaryTreeNode<T> {
 T data;
 BinaryTreeNode<T> left;
 BinaryTreeNode<T> right;

 public BinaryTreeNode(T data) {
 this.data = data;
 }
 }

 ****************************************************************/

public class Solution {

    public static boolean solve(BinaryTreeNode<Integer> left,BinaryTreeNode<Integer> right){
        if(left==null && right == null) return true;
        if(left==null || right==null) return false;
        return left.data.equals(right.data) && solve(left.left,right.right) && solve(left.right,right.left);

    }
    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        // Write your code here.
        return root==null || solve(root.left,root.right);
    }
}