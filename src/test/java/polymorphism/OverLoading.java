package polymorphism;

public class OverLoading {
    /**
     * Method Overloading: When there are multiple functions with the same name but different parameters
     * then these functions are said to be overloaded. Functions can be overloaded by change in the number of
     * arguments or/and a change in the type of arguments.
     * At the time of compilation we can come to know which function we are calling so its called compile time polymorphism
     */

    static int Multiply(int a, int b) {

        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b) {

        // Returns product of double numbers
        return a * b;
    }

    // Main driver method
    public static void main(String[] args) {

        // Calling method by passing
        // input as in arguments
        System.out.println(Multiply(2, 4));
        System.out.println(Multiply(5.5, 6.3));
    }
}
