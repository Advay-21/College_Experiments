import java.io.DataInputStream;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        try {
            DataInputStream input = new DataInputStream(System.in);

            System.out.print("Enter a number: ");
            String numStr = input.readLine();
            int number = Integer.parseInt(numStr);

            System.out.print("Enter the index: ");
            String indexStr = input.readLine();
            int index = Integer.parseInt(indexStr);

            int result = number / index;
            System.out.println("Result: " + result);

            int[] array = {1, 2, 3};
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
