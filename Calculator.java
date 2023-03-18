
public class Calculator {
    public Calculator() {

    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Dividing by zero is not allowed");
            return 0;
        } else {
            return a / b;
        }
    }

    public double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Dividing by zero is not allowed");
            return 0;
        } else {
            return a % b;
        }
    }

    public String transfertoBinary(int a, int b) {
        String convert = Integer.toBinaryString(a);
        System.out.println(convert);
        String convert2 = Integer.toBinaryString(b);
        System.out.println(convert2);
        return a + "  " + "  " + b;
    }

    public static void double_to_binary(int n, int m) {
        int[] bin_num = new int[45];
        int i = 0;
        while (n > 0 && m > 0) {
            bin_num[i] = n % 2;
            n = n / 2;
            i++;
            bin_num[i] = m % 2;
            m = m / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(bin_num[j]);
    }
}
