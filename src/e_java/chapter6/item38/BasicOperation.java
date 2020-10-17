package e_java.chapter6.item38;

/**
 * FileName: BasicOperation
 * Date: 2020/10/13 16:42
 * Author:cs
 * Description:
 */
public enum  BasicOperation implements Operation {

    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { return x / y; }
    };

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override public String toString() {
        return symbol;
    }

    public static void main(String[] args) {
        System.out.println(BasicOperation.DIVIDE.toString());
    }
}
