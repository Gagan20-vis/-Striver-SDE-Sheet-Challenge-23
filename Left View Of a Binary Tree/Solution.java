import java.util.ArrayList;


public class Solution
{
    private static void solve(TreeNode<Integer> root,ArrayList<Integer> ans,int level){
        if(root!=null){
            if(level==ans.size()) ans.add(root.data);
            solve(root.left,ans,level+1);
            solve(root.right,ans,level+1);
        }
    }
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root)
    {
        //    Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root,ans,0);
        return ans;
    }
}
