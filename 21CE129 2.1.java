import java.util.Scanner;

//program prepared by moxshang shah 21CE129
public class TestCylinder {
    public static void main(String[] args) {

        Cylinder cylinder1 = new Cylinder();//Default Constructer
        Cylinder cylinder2 = new Cylinder(5);//single parameterized constructer
        Cylinder cylinder3 = new Cylinder(5, 6);//double parameterized constructer

        System.out.println("Area of cylinder1 is " + cylinder1.getArea());
        System.out.println("Area of cylinder2 is " + cylinder2.getArea());
        System.out.println("Area of cylinder3 is " + cylinder3.getArea());
    }
}

class Cylinder {
    Cylinder() {
        double radius = 1;
        double height = 1;
    }

    Cylinder(double r) {
        radius = r;
    }

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    double getArea() {
        return ( 2*Math.PI * radius * height + 2 * Math.PI * radius * radius);//Operation to get Area
    }
}
