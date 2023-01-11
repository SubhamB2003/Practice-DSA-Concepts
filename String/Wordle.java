
/* package codechef; // don't place package name! */
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            String m = sc.next();

            StringBuilder newString = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == m.charAt(i)) {
                    newString.append("G");
                } else {
                    newString.append("B");
                }
            }

            System.out.println(newString.toString());
        }

        sc.close();
    }
}
