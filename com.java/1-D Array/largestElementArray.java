import java.util.*;

public class largestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter the elemnents : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("The Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // int max = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println("The maximum element in the given array is " + max);
        sc.close();
    }
}