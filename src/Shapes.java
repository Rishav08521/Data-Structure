import java.util.Scanner;

// Abstract class for 2D shapes
abstract class Shape2D {
    abstract double getArea();
    abstract double getPerimeter();
}

// Abstract class for 3D shapes
abstract class Shape3D {
    abstract double getSurfaceArea();
    abstract double getVolume();
}

// Square class (inherits from Shape2D)
class Square extends Shape2D {
    private double side;

    public Square(double side) {
        this.side = side;
    }


    double getArea() {
        return side * side;
    }


    double getPerimeter() {
        return 4 * side;
    }
}

// Circle class (inherits from Shape2D)
class Circle extends Shape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    double getArea() {
        return Math.PI * radius * radius;
    }


    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Cube class (inherits from Shape3D)
class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double getSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    double getVolume() {
        return side * side * side;
    }
}

// Sphere class (inherits from Shape3D)
class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);

        System.out.println("2D Shape - Square");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);

        System.out.println("\n2D Shape - Circle");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.print("Enter the side length of the cube: ");
        double cubeSide = scanner.nextDouble();
        Cube cube = new Cube(cubeSide);

        System.out.println("\n3D Shape - Cube");
        System.out.println("Surface Area: " + cube.getSurfaceArea());
        System.out.println("Volume: " + cube.getVolume());

        System.out.print("Enter the radius of the sphere: ");
        double sphereRadius = scanner.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);

        System.out.println("\n3D Shape - Sphere");
        System.out.println("Surface Area: " + sphere.getSurfaceArea());
        System.out.println("Volume: " + sphere.getVolume());
    }
}