import java.util.*;
class Staff
{
String code;
String name;
Staff(String c,String n)
{
code=c;
name=n;
}
}
class Teacher extends Staff
{
Teacher()
{
super("DS:19","Aryan");
}
String sub;
int exp;
public void read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Teacher SUBJECT and EXPERIENCE:");
sub=sc.next();
exp=sc.nextInt();
}
public void display()
{
System.out.println("***TEACHER INFORMATION***");
System.out.println("Code: "+code);
System.out.println("Name: "+name);
System.out.println("Teacher Subject: "+sub);
System.out.println("Teacher Experience: "+exp);
}
}
class Typist extends Staff
{
int speed,exp;
Typist(int speed,int exp,String code, String name)
{
super(code,name);
this.speed=speed;
this.exp=exp;
}
}
class Regular extends Typist
{
int sal;
Scanner sc=new Scanner(System.in);
Regular(int speed,int exp,String code, String name)
{
super(speed,exp,code,name);
}
public void read()
{
System.out.println("Enter salary of REGULAR TYPIST:");
sal=sc.nextInt();
}
public void display()
{
System.out.println("***REGULAR TYPIST INFORMATION***");
System.out.println("Code: "+code);
System.out.println("Name: "+name);
System.out.println("Typing Speed: "+speed);
System.out.println("Experience: "+exp);
System.out.println("Salary: "+sal);
}
}
class Casual extends Typist
{
int sal;
Scanner sc=new Scanner(System.in);
Casual(int speed,int exp,String code, String name)
{
super(speed,exp,code,name);
}
public void read()
{
System.out.println("Enter salary of CASUAL TYPIST:");
sal=sc.nextInt();
}
public void display()
{
System.out.println("***CASUAL TYPIST INFORMATION***");
System.out.println("Code: "+code);
System.out.println("Name: "+name);
System.out.println("Typing Speed: "+speed);
System.out.println("Experience: "+exp);
System.out.println("Salary: "+sal);
}
}
class Officer extends Staff
{
String dept, grade;
Scanner sc=new Scanner(System.in);
Officer()
{
super("DJ:101","MR.DEASI");
}
public void read()
{
System.out.println("Enter Officer Dept: ");
dept=sc.next();
System.out.println("Enter Officer Grade: ");
grade=sc.next();
}
public void display()
{
System.out.println("***OFFICER INFORMATION***");
System.out.println("Code: "+code);
System.out.println("Name: "+name);
System.out.println("Officer Department: "+dept);
System.out.println("Officer Grade: "+grade);
}
}
class Main
{
public static void main(String args[])
{
System.out.println("Advay Sharma 60009220147");
Teacher t=new Teacher();
t.read();
t.display();
Officer o=new Officer();
o.read();
o.display();
Regular r=new Regular(30,10,"DJ:10","MR.JAI");
r.read();
r.display();
Casual c=new Casual(25,5,"DJ:15","MR.Singh");
c.read();
c.display();
}
}
