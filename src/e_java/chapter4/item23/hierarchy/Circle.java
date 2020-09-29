package e_java.chapter4.item23.hierarchy;

/**
 * FileName: Circle
 * Date: 2020/9/29 16:47
 * Author:cs
 * Description:
 */
class Circle extends Figure{

    final double radius;//半径

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*(radius*radius);
    }
}
