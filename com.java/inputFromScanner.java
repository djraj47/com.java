import java.util.*;

public class inputFromScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a stirng : ");
        String name = sc.nextLine();
        System.out.println("You entered " + name);

        System.out.print("Enter a integer value :");
        int num = sc.nextInt();
        System.out.println("you entered " + num);

        char group = sc.next().charAt(5);
        System.out.println("Character entered is " + group);
        sc.close();
    }
}
