import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int n = mat.size(),m = mat.get(0).size();
        int low = 0,high =(n*m)-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int element = mat.get(mid/m).get(mid%m);
            if(element==target) return true;
            else if(element<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}