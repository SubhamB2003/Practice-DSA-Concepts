import java.util.*;

public class SlidingWindow {

    public static void main(String[] args) {

        // Time Complexcity O(n*k)

        Scanner sc = new Scanner(System.in);

        int a[] = new int[11];
        int n = 11;

        System.out.println("Enter the array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the k window : ");
        int k = sc.nextInt();

        // Using Array
        /*
         * System.out.println("Sliding windows max elements : ");
         * for (int i = 0; i < n - k; i++) {
         * 
         * int max = a[i];
         * for (int j = 1; j < k; j++) {
         * if (max < a[i + j]) {
         * max = a[i + j];
         * }
         * }
         * 
         * System.out.println(max + " ");
         * }
         */

        // Using PriorityQueue
        // Time Complexcity O(nlogk)

        /*
         * PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         * ArrayList<Integer> res = new ArrayList<>();
         * 
         * int i = 0;
         * for (i = 0; i < k; i++) {
         * pq.add(a[i]);
         * }
         * 
         * res.add(pq.peek());
         * 
         * pq.remove(a[0]);
         * 
         * for (; i < n; i++) {
         * pq.add(a[i]);
         * 
         * res.add(pq.peek());
         * 
         * pq.remove(a[i - k + 1]);
         * }
         * 
         * System.out.println("Answer : " + res);
         */

        // Using Deque
        // Time Complexcity O(n);

        Deque<Integer> dq = new ArrayDeque<>();
        int i;
        for (i = 0; i < k; ++i) {
            while (!dq.isEmpty() && a[i] >= a[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for (; i < n; ++i) {
            System.out.println(a[dq.peek()] + " ");

            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }

            while (!dq.isEmpty() && a[i] >= a[dq.peekLast()]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        System.out.println(a[dq.peek()]);
        
        sc.close();
    }

}
