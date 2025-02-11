abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

 class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(3, 8);
        System.out.println("Area of triangle: " + triangle.calculateArea());
    }
}
