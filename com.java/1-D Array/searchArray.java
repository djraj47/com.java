import java.util.*;

public class searchArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search :");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Elemnt found at index " + i);

            }
        }
        sc.close();
    }
}