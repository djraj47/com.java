import java.util.*;

// In jagged array ,  each rows can have diff no of columnn .

public class jaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 3;
        int arr[][] = new int[m][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
