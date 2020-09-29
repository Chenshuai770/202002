package e_java.chapter4.item16;

/**
 * FileName: Point
 * Date: 2020/9/29 10:48
 * Author:cs
 * Description: 包级私有 defalut关键字只能在相同包下面才能被访问
 */
class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

     String getName() {
        return "父类";
    }


}



