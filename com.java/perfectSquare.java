import java.util.*;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check :");
        int num = sc.nextInt();
        int square = 0;
        int i = 1;
        while (square <= num) {
            square = i * i;
            if (num == square) {
                System.out.println(num + " is a Perfect Sqaure  of " + i);
                break;
            }
            i++;
        }
        if (square > num) {
            System.out.println(num + " is not a Perfect Sqaure");
        }
    }

}