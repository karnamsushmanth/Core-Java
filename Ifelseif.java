public class Ifelseif {
    public static void main(String a[]) {
        int x = 8;
        int y = 7;
        int z = 6;
        if (x > y && x > z) {
            System.out.println("x is greater than y and z");
        } else if (y > x && y > z) {
            System.out.println("y is greater than x and z");
        } else {
            System.out.println("z is greater than x and y");
        }
    }

}
