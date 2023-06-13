import java.util.* ;
import java.io.*;
public class Solution {
    private static long merge(long[] arr,int low,int mid,int high){
        int i = low,k = low,j = mid+1;
        long cnt=0;
        long[] temp = new long[low+high+1];
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]) temp[k++] = arr[i++];
            else{
                temp[k++] = arr[j++];
                cnt += (mid-i+1);
            }
        }
        while(i<=mid) temp[k++] = arr[i++];
        while(j<=high) temp[k++] = arr[j++];
        for(int itr = low;itr<=high;itr++) arr[itr] = temp[itr];
        return cnt;
    }
    private static long mergesort(long[] arr,int low,int high){
        long cnt = 0;
        if(low<high){
            int mid = low+(high-low)/2;
            cnt += mergesort(arr, low, mid);
            cnt += mergesort(arr, mid+1, high);
            cnt += merge(arr, low, mid, high);
        }
        return cnt;
    }
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        System.gc();
        return mergesort(arr, 0, n-1);

    }
}