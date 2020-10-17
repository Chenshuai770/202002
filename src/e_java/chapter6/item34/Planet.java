package e_java.chapter6.item34;

/**
 * FileName: Planet
 * Date: 2020/10/13 15:29
 * Author:cs
 * Description:
 */
public enum  Planet {
    MERCURY(3.302e+23, 2.439e6),
    VENUS  (4.869e+24, 6.052e6),
    EARTH  (5.975e+24, 6.378e6),
    MARS   (6.419e+23, 3.393e6),
    JUPITER(1.899e+27, 7.149e7),
    SATURN (5.685e+26, 6.027e7),
    URANUS (8.683e+25, 2.556e7),
    NEPTUNE(1.024e+26, 2.477e7);


    private final double mass;           // In kilograms 重量
    private final double radius;         // In meters 半径
    private final double surfaceGravity; // In m / s^2 //表面重力

    // 万有引力常数 m^3 / kg s^2
    private static final double G = 6.67300E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass / (radius * radius);
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceWeight(double mass) {
        return mass * surfaceGravity;  // F = ma
    }
}
