import java.util.*;

public class stringFunctions {
    public static void main(String[] args) {
        String s1 = "raj kiran";
        String s2 = "raj";
        System.out.println(s1.length()); // gives the lenght of the String
        System.out.println(s1.charAt(4)); // gives the char at index
        System.out.println(s1.substring(2));  // print stirng from the given index 
        System.out.println(s1.substring(2,8));  // print stirng from the given index to n-1 index    
        System.out.println(s1.contains(s2));  // check that the given stirng cotains the sub substring and returns bool values      
        System.out.println(s1.equals(s2));


        int res = s1.compareTo(s2);
        if(res==0)
        System.out.println("same");
        if(res>0)
        System.out.println("s1 is greater");
        if(res<0)
        System.out.println("s1 is smaller");
    }
}
