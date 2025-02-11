import java.util.Scanner;
class Student {
 String name;
int id;
 int mathMarks;
 int physicsMarks;
int chemistryMarks;
 int totalMarks;
Student(String name, int id, int mathMarks, int physicsMarks, int chemistryMarks) {
this.name = name;
this.id = id;
this.mathMarks = mathMarks;
this.physicsMarks = physicsMarks;
this.chemistryMarks = chemistryMarks;
this.totalMarks = mathMarks + physicsMarks + chemistryMarks;
}
 String getName() {
return name;

}
 int getId() {
return id;
}
int getTotalMarks() {
return totalMarks;
}
}
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Advay 60009220147");
System.out.print("Enter the number of students: ");
int numStudents = sc.nextInt();
Student[] students = new Student[numStudents];
for (int i = 0; i < numStudents; i++) {
System.out.println("Enter details for student " + (i + 1) + ":");
System.out.print("Name: ");
String name = sc.next();
System.out.print("ID: ");
int id = sc.nextInt();
System.out.print("Maths marks: ");
int mathMarks = sc.nextInt();

System.out.print("Physics marks: ");
int physicsMarks = sc.nextInt();
System.out.print("Chemistry marks: ");
int chemistryMarks = sc.nextInt();
students[i] = new Student(name, id, mathMarks, physicsMarks, chemistryMarks);
}
for (int i = 0; i < numStudents - 1; i++) {
for (int j = 0; j < numStudents - i - 1; j++) {
if (students[j].getTotalMarks() < students[j + 1].getTotalMarks()) {
Student temp = students[j];
students[j] = students[j + 1];
students[j + 1] = temp;
}
}
}
System.out.println("\nStudent List (Descending Order of Total Marks):");
for (Student student : students) {
System.out.println("Name: " + student.getName());
System.out.println("ID: " + student.getId());
System.out.println("Total Marks: " + student.getTotalMarks());
}
sc.close();
}

}