package e_java.chapter6.item34;

/**
 * FileName: Operation
 * Date: 2020/10/13 15:41
 * Author:cs
 * Description: 不推荐使用
 */
public enum Operation {
    PLUS, MINUS, TIMES, DIVIDES;

    public double apply(double x, double y) {
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDES:
                return x / y;
        }
        throw new AssertionError("Unknonw op:" + this);
    }
}
