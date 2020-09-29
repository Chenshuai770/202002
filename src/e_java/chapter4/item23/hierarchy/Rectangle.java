package e_java.chapter4.item23.hierarchy;

/**
 * FileName: Rectangle
 * Date: 2020/9/29 16:50
 * Author:cs
 * Description:
 */
class Rectangle extends Figure {
    final double length;
    final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
