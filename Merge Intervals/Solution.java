import java.util.* ;
import java.io.*;
/*******************************************************

 Following is the Interval class structure

 class Interval {
 int start, int finish;

 Interval(int start, int finish) {
 this.start = start;
 this.finish = finish;
 }
 }

 *******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        Arrays.sort(intervals,(a,b) -> a.start-b.start);
        int start = intervals[0].start;
        int finish = intervals[0].finish;
        List<Interval> ans = new ArrayList<>();
        for(Interval i:intervals){
            if(i.start<=finish) finish = Math.max(finish, i.finish);
            else{
                ans.add(new Interval(start,finish));
                start = i.start;
                finish = i.finish;
            }
        }
        ans.add(new Interval(start,finish));
        return ans;
    }
}
