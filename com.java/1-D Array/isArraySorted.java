import java.util.*;

public class isArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = isSorted(arr, n);
        {
            if (ans == true)
                System.out.println("The array is sorted");
            else
                System.out.println("The array is not sorted");
        }
        sc.close();
    }

    public static boolean isSorted(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    };
}
