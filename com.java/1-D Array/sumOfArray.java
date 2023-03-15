import java.util.*;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[n];
        System.out.println("Enter the elements of Array  :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of elements of Array is :" + sum);
        sc.close();
    }
}
