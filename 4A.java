import java.util.Scanner;
import java.util.Vector;

class Main {
    public static void main(String z[]) {
        Vector<String> studentNames = new Vector<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student names (enter 'exit' to finish):");

        while (true) {
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            studentNames.add(name);
        }

        System.out.println("Student names stored in vector:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
