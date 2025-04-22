class Calculator {
    int a;

    public int add(int n1, int n2) {
        int r = n1 + n2;

        // System.out.println("in add");
        return r;
    }
}

public class classesandobjects {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 7;
        Calculator obj = new Calculator();
        int result = obj.add(4, 5);
        System.out.println(result);

    }

}