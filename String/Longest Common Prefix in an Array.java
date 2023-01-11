import java.util.*;;

class Solution {
    String longestCommonPrefix(String arr[], int n) {
        // code here
        StringBuilder sb = new StringBuilder();

        Arrays.sort(arr);

        for (int i = 0; i < arr[0].length(); i++) {
            String x = arr[0];
            String y = arr[n - 1];
            if (x.charAt(i) == y.charAt(i)) {
                sb.append(x.charAt(i));
            } else {
                break;
            }
        }

        if (sb.length() == 0) {
            sb.append("-1");
        }

        return sb.toString();
    }
}