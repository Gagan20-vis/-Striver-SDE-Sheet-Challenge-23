import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int cnt1 = 0, cnt2 = 0;
        Integer ele1 = null, ele2 = null;

        // Find two potential majority elements
        for (int i : arr) {
            if (ele1 != null && ele1 == i) {
                cnt1++;
            } else if (ele2 != null && ele2 == i) {
                cnt2++;
            } else if (cnt1 == 0) {
                ele1 = i;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                ele2 = i;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        // Reset counters for counting occurrences of the potential majority elements
        cnt1 = 0;
        cnt2 = 0;

        // Count occurrences of the potential majority elements
        for (int i : arr) {
            if (ele1 != null && ele1 == i) {
                cnt1++;
            }
            if (ele2 != null && ele2 == i) {
                cnt2++;
            }
        }

        // Check if the counts satisfy the majority condition
        int minOccurrence = arr.size() / 3 + 1;
        if (cnt1 >= minOccurrence) {
            ans.add(ele1);
        }
        if (cnt2 >= minOccurrence) {
            ans.add(ele2);
        }
        return ans;
    }
}
