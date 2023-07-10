public class TernaryOperator {
    public static void main(String[] args) {
        double val1 = 20.00d;
        double val2 = 80.00d;
        double result = (val1 + val2) * 100;
        System.out.println("Result is " + result);
        double theRemainder = result % 40.00;
        System.out.println("Remainder is " + theRemainder);
        boolean isRemainder = (theRemainder == 0) ? true : false;
        System.out.println("Remainder is " + isRemainder);
    }
}
