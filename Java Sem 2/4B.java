import java.util.Scanner;
import java.util.Vector;
class Main {
public static void main(String[] args) {
Vector<String> stringVector = new Vector<>();
Scanner scanner = new Scanner(System.in);
System.out.println("Advay 60009220147");
System.out.print("Enter the number of strings to add: ");
int n = scanner.nextInt();
scanner.nextLine();
for (int i = 0; i < n; i++) {
System.out.print("Enter string " + (i + 1) + ": ");
String input = scanner.nextLine();
stringVector.add(input);
}
System.out.print("Enter a new string to check and update the Vector: ");
String newString = scanner.nextLine();
if (stringVector.contains(newString)) {

stringVector.remove(newString);
System.out.println("String found in Vector and removed.");
} else {
stringVector.add(newString);
System.out.println("String not found in Vector and added.");
}
System.out.println("Updated Vector:");
for (String str : stringVector) {
System.out.println(str);
}
scanner.close();
}
}