// Abstract class Shape
abstract class Shape {
    public abstract String getDescription();
}

// Abstract class TwoDimensionalShape
abstract class TwoDimensionalShape extends Shape {
    public abstract double getArea();
}

// Abstract class ThreeDimensionalShape
abstract class ThreeDimensionalShape extends Shape {
    public abstract double getArea();
    public abstract double getVolume();
}

// Class Circle
class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDescription() {
        return "Circle with radius " + radius;
    }
}

// Class Square
class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getDescription() {
        return "Square with side " + side;
    }
}

// Class Sphere
class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    @Override
    public String getDescription() {
        return "Sphere with radius " + radius;
    }
}

// Class Cube
class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public String getDescription() {
        return "Cube with side " + side;
    }
}

// Main class to test the hierarchy
public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(4);
        shapes[2] = new Sphere(3);
        shapes[3] = new Cube(2);

        for (Shape shape : shapes) {
            System.out.println(shape.getDescription());
            if (shape instanceof TwoDimensionalShape) {
                System.out.println("Area: " + ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                System.out.println("Area: " + ((ThreeDimensionalShape) shape).getArea());
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println();
        }
    }
}