import java.util.*;


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        
        int ans = 0, sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
            else {
                int len = i - map.get(sum);
                ans = Math.max(ans, len);
            }
        }
        
        return ans;
    }
}