import java.util.ArrayList;

public class Solution {
    public static boolean isSafe(int x,int y,int[][] maze,int n,int[][] visited){
        if(x>=n || y>=n || x<0 || y < 0 || maze[x][y]==0 || visited[x][y]==1) return false;
        return true;
    }
    public static void solve(int x,int y,int[][] maze,int n,ArrayList<ArrayList<Integer>> ans,int[][] visited){
        visited[x][y] = 1;
        if(x==n-1 && y==n-1){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++){
                    temp.add(visited[i][j]);
                }
            ans.add(temp);
            visited[x][y] = 0;
            return ;
        }
        if(isSafe(x+1, y, maze, n, visited)) solve(x+1, y, maze, n, ans, visited);
        if(isSafe(x, y-1, maze, n, visited)) solve(x, y-1, maze, n, ans, visited);
        if(isSafe(x, y+1, maze, n, visited)) solve(x, y+1, maze, n, ans, visited);
        if(isSafe(x-1, y, maze, n, visited)) solve(x-1, y, maze, n, ans, visited);
        visited[x][y] = 0;
    }
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(maze[0][0]==0) return ans;
        int[][] visited = new int[n][n];
        solve(0,0,maze,n,ans,visited);
        return ans;
    }
}