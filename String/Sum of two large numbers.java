class Solution {
    String findSum(String X, String Y) {
        // code here
        StringBuilder sb = new StringBuilder();
        int temp = 0, n = X.length() - 1, m = Y.length() - 1;

        while (n >= 0 || m >= 0 || temp > 0) {
            int a = n >= 0 ? (X.charAt(n--) - '0') : 0;
            int b = m >= 0 ? (Y.charAt(m--) - '0') : 0;

            int sum = temp + a + b;
            int digit = sum % 10;
            temp = sum / 10;

            sb.append(digit);
        }
        sb.reverse();

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
