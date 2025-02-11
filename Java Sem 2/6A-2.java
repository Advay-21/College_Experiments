class Shape {
    private double area;
    public Shape(double side) {
        area = side * side;
    }
    public Shape(double length, double width) {
        area = length * width;
    }
    public Shape(Shape shape) {
        area = shape.area;
    }
    public Shape() {
        area = 0;
    }

    public double getArea() {
        return area;
    }
}

class Main {
    public static void main(String args[]) {
        Shape square = new Shape(5);
        System.out.println("Area of square: " + square.getArea());

        Shape rectangle = new Shape(4, 6);
        System.out.println("Area of rectangle: " + rectangle.getArea());

        Shape squareCopy = new Shape(square);
        System.out.println("Area of copied square: " + squareCopy.getArea());

        Shape defaultShape = new Shape();
        System.out.println("Default area: " + defaultShape.getArea());
    }
}
