import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the side length of the square: ");
int side = sc.nextInt();
System.out.print("Enter the length of the rectangle: ");
int length = sc.nextInt();
System.out.print("Enter the width of the rectangle: ");
int width = sc.nextInt();
int squareArea = calculateArea(side);
int rectangleArea = calculateArea(length, width);
System.out.println("Area of the square: " + squareArea);
System.out.println("Area of the rectangle: " + rectangleArea);
sc.close();

}
public static int calculateArea(int side) {
return side * side;
}
public static int calculateArea(int length, int width) {
return length * width;
}
}