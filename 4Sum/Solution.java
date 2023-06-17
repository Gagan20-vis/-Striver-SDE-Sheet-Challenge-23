import java.util.Arrays;
public class Solution {
    public static String fourSum(int[] arr, int target, int n) {
        // Write your code here.
        Arrays.sort(arr);

        for(int a = 0; a<n; a++){

            if(a>0 && arr[a]==arr[a-1]) continue;
            for(int b = a+1; b<n; b++){
                if(b!=a+1 && arr[b]==arr[b-1]) continue;
                int c = b+1,d = n-1;
                long sum = target - (long)(arr[a]+arr[b]);
                while(c<d){
                    if(arr[c]+arr[d]==sum){
                        return "Yes";
                    } else if(arr[c]+arr[d]<sum) c++;
                    else d--;
                }
            }
        }
        return "No";
    }
}
