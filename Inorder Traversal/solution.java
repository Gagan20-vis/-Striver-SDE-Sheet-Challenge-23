public class Solution {
    private static void solve(TreeNode root,List<Integer> ans){
        if(root!=null){
            solve(root.left,ans);
            ans.add(root.data);
            solve(root.right,ans);
        }
    }
    public static List < Integer > getInOrderTraversal(TreeNode root) {
        // Write your code here.
        List < Integer > ans = new ArrayList<>();
        solve(root,ans);
        return ans;
    }
}