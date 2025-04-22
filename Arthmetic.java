public class Arthmetic {
    public static void main(String a[]) {
        int num1 = 6;
        int num2 = 5;
        int addition = num1 + num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        double modulous = num1 % num2;
        System.out.println(addition);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modulous);
        num1 = num1 + 2;
        System.out.println(num1);
        int pre = ++num1; // pre-increment
        System.out.println(pre);
        int post = num1++; // fetch the value and then it will increment
        System.out.println(post);
    }

}