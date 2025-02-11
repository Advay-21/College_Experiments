import java.util.* ;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno[] = new int[5];
        int sub1[] = new int[5];
        int sub2[] = new int[5];
        int sub3[] = new int[5];
        int total[] = new int[5];
        int max = total[0], temp = 0;
        System.out.println("Name-Advay Sharma" + "\n" + "Sap Id-60009220147");
        System.out.println("Enter the details for the student  ");
        for (int i = 0; i < rollno.length; i++) {
            System.out.printf("Enter roll no of student %d:", i + 1);
            rollno[i] = input.nextInt();
            System.out.printf("Enter sub1 marks of student %d:", i + 1);
            sub1[i] = input.nextInt();
            System.out.printf("Enter sub2 marks of student %d:", i + 1);
            sub2[i] = input.nextInt();
            System.out.printf("Enter sub3 marks of student %d:", i + 1);
            sub3[i] = input.nextInt();
        }
        System.out.println("Roll-No" + "  " + "Sub1" + "\t" + "Sub2" + "\t" + "Sub3" + "\t" +  "Total");
        for (int i = 0; i < rollno.length; i++) {
            total[i] = sub1[i] + sub2[i] + sub3[i];
            System.out.println(rollno[i] + "\t" + sub1[i] + "\t" + sub2[i] + "\t" + sub3[i] + "\t" + total[i]);
        }
        for (int i = 0; i < rollno.length; i++) {
            if (total[i] > max) {
                max = total[i];
                temp = i + 1;
     }
}
        System.out.printf("The highest marks is obtained by student%d : %d ", temp, max);
    }
}
