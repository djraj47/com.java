import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size if the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] != arr[i]) {
                    count++;
                    
                }
            }
        }
        System.out.println(count);
    }
}