import java.util.ArrayList;
public class Solution {

    private static boolean isSafe(int[][] board, int row,int col){
        for(int i = 0;i<row;i++)
            if(board[i][col]==1) return false;
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if(board[i][j]==1) return false;
        for(int i = row-1, j=col + 1;i >= 0 && j<board.length;i--,j++)
            if(board[i][j]==1) return false;
        return true;
    }

    private static void solve(int ind,int n,int[][] board,ArrayList<ArrayList<Integer>> ans){
        if(ind==n){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0;i<n;i++)
                for(int j = 0;j<n;j++)
                    temp.add(board[i][j]);
            ans.add(temp);
            return ;
        }
        for(int col = 0; col < n; col++){
            if(isSafe(board,ind,col)){
                board[ind][col] = 1;
                solve(ind+1,n,board,ans);
                board[ind][col] = 0;
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[][] board = new int[n][n];
        solve(0,n,board,ans);
        return ans;

    }
}