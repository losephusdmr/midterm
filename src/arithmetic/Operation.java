package arithmetic;

/**
 * Enum representing supported arithmetic operations.
 * Each constant implements apply(a, b).
 */
public enum Operation {
    PLUS {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    TIMES {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public double apply(double a, double b) {
            return a / b; // (you may add divide-by-zero handling if required)
        }
    };

    public abstract double apply(double a, double b);
}