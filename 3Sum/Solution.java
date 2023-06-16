import java.util.ArrayList;
import java.util.Arrays;
public class Solution {

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int k)  {

        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n-2 ; i++)
            if(i==0 || (i>0 && arr[i]!=arr[i-1])){
                int low = i+1,high = n-1,sum = k-arr[i];
                while(low<high)
                    if(arr[low]+arr[high]==sum){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[low]);
                        temp.add(arr[high]);
                        ans.add(temp);

                        while(low<high && (arr[low]==arr[low+1])) low++;
                        while(low<high && (arr[high]==arr[high-1])) high--;

                        low++;
                        high--;
                    }else if(arr[low]+arr[high]<sum) low++;
                    else high--;
            }
        return ans;
    }
}
