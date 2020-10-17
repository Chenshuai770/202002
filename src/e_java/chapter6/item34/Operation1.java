package e_java.chapter6.item34;

/**
 * FileName: Operation1
 * Date: 2020/10/13 16:04
 * Author:cs
 * Description:
 */
public enum Operation1 {

    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };;


    private final String symbol;

    Operation1(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x, double y);


    public static void main(String[] args) {
        double x = 2.222;
        double y = 3.333;
        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }

    }
}
