import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReaderr {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter name :");
        // String s = br.readLine();
        // System.out.println(s);

        System.out.println("Enter a integer");
        int x = Integer.parseInt(br.readLine());
        String name = br.readLine();
        System.out.println(x);
        System.out.println(name);
    }

}
