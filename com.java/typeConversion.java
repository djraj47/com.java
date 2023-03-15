public class typeConversion {
    public static void main(String[] args) {
        int a = 10;
        long b = 3;
        float c = 45.6f;

        // widening or implict type conversion

        b = a;
        c = b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int s = 34;
        long f = 100;
        double r = 56.089;

        // narrowing or explict type conversion

        char ch = 'a';
        f = (long)ch;
        ch = (char) f;
        s = (int) r;

        System.out.println(s);
        System.out.println(f);
        System.out.println(r);
        System.out.println(ch);
    }
}
