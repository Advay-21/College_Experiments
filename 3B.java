import java.util.* ;
class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Name-Advay Sharma" + "\n" + "Sap Id-60009220147");
        System.out.print("Enter a string : ");
        String s = input.nextLine();
        System.out.print("Enter a character :");
        char c = input.next().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.printf("The number of occurrence of %c in string is : %d", c, count);
    }
}

