class Solution {
    static int palindromepair(int N, String arr[]) {
        // code here

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (isPalindrome(arr[i] + arr[j])) {
                    return 1;
                }
                if (isPalindrome(arr[j] + arr[i])) {
                    return 1;
                }
            }
        }

        return 0;
    }

    static boolean isPalindrome(String s) {
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
};