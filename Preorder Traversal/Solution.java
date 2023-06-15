public class Solution {

    private static void solve(TreeNode root,List<Integer> ans){
        if(root!=null){
            ans.add(root.data);
            solve(root.left,ans);
            solve(root.right,ans);
        }
    }
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
        // Write your code here.
        List < Integer > ans = new ArrayList<>();
        solve(root,ans);
        return ans;
    }
}