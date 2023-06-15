public class Solution {
    private static void solve(TreeNode root,List<Integer> ans){
        if(root!=null){
            solve(root.left,ans);
            solve(root.right,ans);
            ans.add(root.data);
        }
    }
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
        // Write your code here.
        List < Integer > ans = new ArrayList<>();
        solve(root,ans);
        return ans;
    }
}