import java.util.* ;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr)
    {
        int ind = -1,n = arr.size();
        for(int i = n-2;i>=0;i--)
            if(arr.get(i)<arr.get(i+1)){
                ind = i;
                break;
            }
        if(ind==-1){
            Collections.reverse(arr);
            return arr;
        }
        for(int i= n-1;i>ind;i--)
            if(arr.get(i)>arr.get(ind)){
                int temp = arr.get(i);
                arr.set(i,arr.get(ind));
                arr.set(ind,temp);
                break;
            }
        List<Integer> sublist = arr.subList(ind+1, n);
        Collections.reverse(sublist);
        return arr;
    }
}
