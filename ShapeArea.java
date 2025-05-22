import java.util.*;

class ShapeArea {
    void calculateArea(float a) {
        System.out.println("Square = " + (a * a));
    }

    void calculateArea(int l, int b) {
        System.out.println("Rectangle = " + (l * b));
    }

    void calculateArea(double r) {
        System.out.println("Circle = " + (3.14 * r * r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeArea s = new ShapeArea();
        System.out.print("Square side: ");
        s.calculateArea(sc.nextFloat());
        System.out.print("Circle radius: ");
        s.calculateArea(sc.nextDouble());
        System.out.print("Rectangle sides: ");
        s.calculateArea(sc.nextInt(),
        sc.nextInt());
        sc.close();
    }
}
