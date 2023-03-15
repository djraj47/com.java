import java.util.*;

public class countDistinctElemnets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size if the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = isDistinct(arr, n);
        System.out.println("Number of Distinct Elements are " + res);
        sc.close();
    }

    public static int isDistinct(int[] arr, int n) {
        int count = 0;
        boolean check = true;
        for (int i = 0; i < n; i++) {
            for (int j = (i - 1); j >= 0; j--) {
                if (arr[j] == arr[i]) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                count++;
            }
            check = true;
        }
        return count;
    }
}
