public class Rational {
    private int numerator;
    private int denominator;

    // Constructor with parameters
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    // No-argument constructor with default values
    public Rational() {
        this(1, 1);
    }

    // Method to reduce the fraction to its simplest form
    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Method to calculate the greatest common divisor (GCD)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Static method to add two rational numbers
    public static Rational add(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    // Static method to subtract two rational numbers
    public static Rational subtract(Rational r1, Rational r2) {
        int num = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    // Static method to multiply two rational numbers
    public static Rational multiply(Rational r1, Rational r2) {
        int num = r1.numerator * r2.numerator;
        int den = r1.denominator * r2.denominator;
        return new Rational(num, den);
    }

    // Static method to divide two rational numbers
    public static Rational divide(Rational r1, Rational r2) {
        if (r2.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        int num = r1.numerator * r2.denominator;
        int den = r1.denominator * r2.numerator;
        return new Rational(num, den);
    }

    // Method to return a string representation in the form a/b
    public String toRationalString() {
        return numerator + "/" + denominator;
    }

    // Method to return a string representation as a floating-point number
    public String toFloatString() {
        return String.valueOf((double) numerator / denominator);
    }

    public static void main(String[] args) {
        // Test the Rational class
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        System.out.println("Racional 1: " + r1.toRationalString());
        System.out.println("Racional 2: " + r2.toRationalString());

        Rational sum = Rational.add(r1, r2);
        System.out.println("Soma: " + sum.toRationalString() + " = " + sum.toFloatString());

        Rational difference = Rational.subtract(r1, r2);
        System.out.println("Subtração: " + difference.toRationalString() + " = " + difference.toFloatString());

        Rational product = Rational.multiply(r1, r2);
        System.out.println("Multiplicação: " + product.toRationalString() + " = " + product.toFloatString());

        Rational quotient = Rational.divide(r1, r2);
        System.out.println("Divisão: " + quotient.toRationalString() + " = " + quotient.toFloatString());
    }
}