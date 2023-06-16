import java.util.*;

public class Solution
{
    public static String writeAsYouSpeak(int n)
    {
        // Write your code here.
        if (n == 1)  return "1";
        String prev = writeAsYouSpeak(n-1);
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < prev.length(); i++)
        {
            if (i == prev.length() - 1 || prev.charAt(i) != prev.charAt(i+1)){
                result.append(count);
                result.append(prev.charAt(i));
                count = 1;
            } else count++;
        }
        return result.toString();
    }
}