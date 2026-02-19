package arithmetic;

/**
 * Demo runner for the Arithmetic application.
 * Avoids String/int input for choosing operations and performing them.
 */
public class Arithmetic {

    public static void main(String[] args) {
        ArithmeticBase calc = new ArithmeticBase();

        // Example operands (double, not int)
        double a = 12.5;
        double b = 4.0;

        // Choose the operation via enum (no String/int input menus)
        Operation op = Operation.TIMES;

        double result = calc.calculate(a, b, op);
        System.out.println("Operation: " + op);
        System.out.println("a=" + a + ", b=" + b);
        System.out.println("result :" + result);

        // Optional: show all operations/results (still no user input)
        System.out.println("\nAll operations:");
        for (Operation each : Operation.values()) {
            System.out.println(each + " => " + calc.calculate(a, b, each));
        }
    }
}