public class Solution {
    public static int search(int arr[], int key) {
        // Write your code here.
        int low = 0,high = arr.length-1,ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==key){
                ans = mid;
                break;
            }
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=arr[mid]){
                    if(arr[low]<=key && key<=arr[mid]) high = mid-1;
                    else low = mid+1;
                }
            }
            else{
                if(arr[mid]<arr[high]){
                    if(arr[mid]<=key && key<=arr[high]) low = mid+1;
                    else high = mid-1;
                }
            }
        }
        return ans;
    }
}