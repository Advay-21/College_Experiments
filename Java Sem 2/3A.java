import java.util.* ;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digits = 0, blankspace = 0, lw = 0, up = 0;
        System.out.println("Name-Advay Sharma" + "\n" + "Sap Id-60009220147");
        System.out.print("Enter a string : ");
        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == ' ') {
                blankspace++;
            } else if (c >= 'a' && c <= 'z') {
                lw++;
            } else if (c >= 'A' && c <= 'Z') {
                up++;
            } else {
                digits++;
            }   
        }
        System.out.println("The no of blankspaces are : " + blankspace);
        System.out.println("The no of uppercase letters are : " + up);
        System.out.println("The no of lowercase letters are : " + lw);
        System.out.println("The no of digits are : " + digits);

    }
}
