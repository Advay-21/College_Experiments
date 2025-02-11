import java.util.*;
class MarksOutOfBoundsException extends Exception {
     MarksOutOfBoundsException(String message) {
        super(message);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Marks :");
        try {
            int marks = s.nextInt();

            if (marks < 0 || marks > 100) {
                throw new MarksOutOfBoundsException("Marks should be between 0 and 100.");
            }

            System.out.println("Marks: " + marks);
        } catch (MarksOutOfBoundsException e) {

            System.out.println("MarksOutOfBoundsException occurred: " + e.getMessage());
            System.out.print("Enter Marks :");
            int marks = s.nextInt();
            System.out.println("Marks: " + marks);

        }
    }
}
