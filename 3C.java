import java.util.* ;

class Main{
    public static void main (String[] args)
 {
        Scanner input = new Scanner(System.in);
        System.out.println("Name-Advay Sharma" + "\n" + "Sap Id-60009220147");
        System.out.print("Enter a string : ");
        String a = input.nextLine();
        StringBuilder s = new StringBuilder(a);
        input.close();
        String b = s.reverse().toString();

        if (a.equals(b)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }
    }
}
