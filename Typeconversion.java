// type casting 

public class Typeconversion {
    public static void main(String[] args) {
        byte b = 127;
        int a = b;
        System.out.println(b);
        System.out.println(a);
        int s = 256;
        byte k = (byte) s;
        System.out.println(k);
        float f = 5.7f;
        int m = (int) f;
        System.out.println(m);
        int by = b * k;
        System.out.println(by);
    }

}
