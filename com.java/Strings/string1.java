import java.net.SocketImpl;
import java.util.*;

public class string1 {
    public static void main(String[] args) {
        String s1 = "rajkiran";   // here string s1 and s2 are same any they have same reference to the memory
        String s2 = "rajkiran"; 
        if (s1 == s2) {
            System.out.println("Both s1 and s2 are equal");
        } else
            System.out.println("Both string are not equal");
    

    String s3 = new String("rajkiran");
    if(s3!=s1)
    {
        System.out.println("s3 ans s1 are not equal");
    }

}
}