public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 6));
        System.out.println(myCalculator.add(15.5, 67));
        System.out.println(myCalculator.add(54, 15));
        System.out.println(myCalculator.subtract(55, 66));
        System.out.println(myCalculator.subtract(432, 61));
        System.out.println(myCalculator.subtract(65, 41));
        System.out.println(myCalculator.multiply(6, 4));
        System.out.println(myCalculator.multiply(80, 60));
        System.out.println(myCalculator.multiply(122, 4));
        System.out.println(myCalculator.divide(124, 4));
        System.out.println(myCalculator.divide(210, 5));
        System.out.println(myCalculator.divide(1000, 0));
        System.out.println(myCalculator.transfertoBinary(210, 5));
        System.out.println(myCalculator.transfertoBinary(21, 25));
        System.out.println(myCalculator.transfertoBinary(22, 959));
        myCalculator.double_to_binary(22, 959);
    }
}