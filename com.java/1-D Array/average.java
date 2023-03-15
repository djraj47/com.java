import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the elements of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The average is " + avg(arr));
        sc.close();
    }

    public static int avg(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println(arr.length);
        int average = sum / arr.length;
        return average;

    }
}
