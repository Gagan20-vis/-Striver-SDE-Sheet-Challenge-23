public class Solution {
    public static double median(int[] a, int[] b) {
        // Write your code here.
        int n1 = a.length,n2 = b.length;
        if(n2<n1) return median(b,a);
        int low = 0,high = n1;
        while(low<=high){
            int cut1 = (low+high)>>1;
            int cut2 = (n1+n2+1)/2 -cut1;

            int left1 = (cut1==0) ? Integer.MIN_VALUE : a[cut1-1];
            int left2 = (cut2==0) ? Integer.MIN_VALUE : b[cut2-1];

            int right1 = (cut1==n1) ? Integer.MAX_VALUE : a[cut1];
            int right2 = (cut2==n2) ? Integer.MAX_VALUE : b[cut2];

            if(left1<=right2 && left2<=right1)
                return ((n1+n2)%2==0) ? ((Math.max(left1,left2)+Math.min(right1,right2))/2.0) : Math.max(left1,left2);
            else if(left1>right2) high = cut1 - 1;
            else low = cut1+1;
        }
        return 0.0;
    }
}