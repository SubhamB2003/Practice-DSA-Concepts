/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int d = sc.nextInt();
            String n = sc.next();
            int c = 0;

            for (int i = 0; i < d; i++) {
                if (n.charAt(i) == '0' || n.charAt(i) == '5') {
                    c++;
                    break;
                }
            }

            if (c > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
