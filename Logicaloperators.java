public class Logicaloperators {
    public static void main(String a[]) {
        // combination of two reltional operators
        // AND -&&

        // T && T - T
        // T && F - F
        // F && T - T
        // F && F - F

        // OR - ||

        // T || T -T
        // F || T -T
        // T || F -T
        // F || F -F

        // NOT - !

        // !T - F
        // !F - T

        int x = 7;
        int y = 5;
        int b = 5;
        int c = 9;
        boolean result = x > y && b < c;
        boolean result1 = x > y || b > c;
        boolean result2 = b > c;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(!result2);
    }

}
