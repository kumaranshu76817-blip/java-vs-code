// Custom Exceptions

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }
}

class CannotDivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Input cannot be greater than 100000";
    }
}

class MaxMultiplyException extends Exception {
    @Override
    public String toString() {
        return "Input cannot be greater than 7000 while multiplying";
    }
}


// Calculator Class
class CustomCalculator {

    double add(double a, double b)
            throws InvalidInputException, MaxInputException {

        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        if (a == 8 && b == 9) {
            throw new InvalidInputException();
        }

        return a + b;
    }

    double subtract(double a, double b)
            throws MaxInputException {

        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        return a - b;
    }

    double multiply(double a, double b)
            throws MaxInputException, MaxMultiplyException {

        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        if (a > 7000 || b > 7000) {
            throw new MaxMultiplyException();
        }

        return a * b;
    }

    double divide(double a, double b)
            throws CannotDivideByZeroException, MaxInputException {

        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        if (b == 0) {
            throw new CannotDivideByZeroException();
        }

        return a / b;
    }
}


// Main Class
public class customcaluclator {

    public static void main(String[] args) {

        CustomCalculator c = new CustomCalculator();

        try {
            System.out.println("Addition: " + c.add(1000, 20));
            System.out.println("Subtraction: " + c.subtract(50, 10));
            System.out.println("Multiplication: " + c.multiply(34, 67));
            System.out.println("Division: " + c.divide(100, 5));
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
