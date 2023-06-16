import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static int mergeSort(ArrayList<Integer> nums, int low, int high, int[] temp) {
        int count = 0;
        if(low<high)
        {
            int mid = (low+high)/2;
            count += mergeSort(nums,low,mid,temp);
            count += mergeSort(nums,mid+1,high,temp);
            count += merge(nums,low,mid+1,high,temp);
        }
        return count;
    }

    public static int merge(ArrayList<Integer> nums, int low, int mid, int high, int[] temp) {
        int count = 0, x = mid;
        for(int i=low; i<mid; i++)
        {
            while((x<=high) && (nums.get(i)>2*(long)nums.get(x)))
                x++;

            count += x-mid;
        }

        int i = low, j = mid, k = low;
        while((i<=mid-1) && (j<=high))
        {
            if(nums.get(i)<=nums.get(j))
                temp[k++] = nums.get(i++);
            else
                temp[k++] = nums.get(j++);
        }

        while(i<=mid-1)
            temp[k++] = nums.get(i++);

        while(j<=high)
            temp[k++] = nums.get(j++);

        for(i = low; i<=high; i++)
            nums.set(i, temp[i]);

        return count;
    }
    public static int reversePairs(ArrayList<Integer> arr)
    {
        // Write your code here.
        int[] temp = new int[arr.size()];
        return mergeSort(arr,0,arr.size()-1,temp);

    }
}