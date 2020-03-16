package Task2;

public class Methods {

    public static void main(String[] args) {
        Methods calculator = new Methods();
        try {
            calculator.add(-5, 10);
            calculator.divide(0, 0);
            calculator.multiply(5,5);
            calculator.subtract(43,65);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    double add(double a, double b) throws Exception {
        if ((a < 0 && b < 0) || (a == 0 && b == 0)) {
            throw new IllegalArgumentException();
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException();
        } else if (a > 0 && b > 0) {
            throw new Exception();
        } else {
            return a + b;
        }
    }

    double subtract(double a, double b) throws Exception {
        if ((a < 0 && b < 0) || (a == 0 && b == 0)) {
            throw new IllegalArgumentException();
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException();
        } else if (a > 0 && b > 0) {
            throw new Exception();
        } else {
            return a - b;
        }
    }

    double multiply(double a, double b) throws Exception {
        if ((a < 0 && b < 0) || (a == 0 && b == 0)) {
            throw new IllegalArgumentException();
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException();
        } else if (a > 0 && b > 0) {
            throw new Exception();
        } else {
            return a * b;
        }
    }

    double divide(double a, double b) throws Exception {
        if ((a < 0 && b < 0) || (a == 0 && b == 0)) {
            throw new IllegalArgumentException();
        } else if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException();
        } else if (a > 0 && b > 0) {
            throw new Exception();
        } else {
            return a / b;
        }
    }
}
