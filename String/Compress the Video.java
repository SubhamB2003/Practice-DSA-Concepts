import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int frame[] = new int[n];
            int c = 1;

            for (int i = 0; i < n; i++) {
                frame[i] = sc.nextInt();
            }

            if (frame.length == 1) {
                System.out.println(c);
            } else {
                for (int i = 0; i < n - 1; i++) {
                    if (frame[i] != frame[i + 1]) {
                        c++;
                    }
                }
                System.out.println(c);
            }
        }
        sc.close();
    }
}
