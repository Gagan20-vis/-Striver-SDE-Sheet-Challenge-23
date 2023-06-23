import java.util.*;
public class Solution
{
    public static String serializeTree(TreeNode<Integer> root)
    {
        if(root==null) return "";
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode<Integer> temp = q.poll();
            if(temp==null){
                ans.append("n ");
                continue;
            }
            ans.append(temp.data+" ");
            q.add(temp.left);
            q.add(temp.right);
        }
        return ans.toString();
    }

    public static TreeNode<Integer> deserializeTree(String data)
    {
        if(data=="") return null;
        String[] str = data.split(" ");
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        TreeNode<Integer> ans = new TreeNode(Integer.parseInt(str[0]));
        q.add(ans);
        for(int i = 1;i<str.length;i++){
            TreeNode<Integer>parent = q.poll();
            if(!str[i].equals("n")){
                TreeNode<Integer>left = new TreeNode(Integer.parseInt(str[i]));
                parent.left = left;
                q.add(left);
            }
            if(!str[++i].equals("n")){
                TreeNode<Integer>right = new TreeNode(Integer.parseInt(str[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return ans;
    }
}
