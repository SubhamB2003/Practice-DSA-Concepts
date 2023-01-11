import java.util.Scanner;

public class LeftRotateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the rotate no : ");
        int r = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i < r; i++) {
            arr1[n - 1 - i] = arr[i];
        }

        int c = 0;
        for (int i = r; i < n; i++) {
            arr2[c++] = arr[i];
        }

        for (int i = n-1; i > r; i--) {
            arr2[c++] = arr1[i];
        }

        System.out.println("Printing the array : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i] + " ");
        }

        sc.close();
    }
}
