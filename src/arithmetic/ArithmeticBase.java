package arithmetic;

/**
 * Performs arithmetic calculations using an Operation enum.
 * No user input and no String-based operation selection.
 */
public class ArithmeticBase {

    public double calculate(double a, double b, Operation op) {
        if (op == null) {
            throw new IllegalArgumentException("Operation must not be null");
        }
        return op.apply(a, b);
    }
}