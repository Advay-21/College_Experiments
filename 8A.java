import java.util.*;
class Student
{
	int rollNo;
	Scanner sc=new Scanner(System.in);
	public void read()
	{
		System.out.println("Enter Roll Number:");
		rollNo=sc.nextInt();	
	}
}
class Test extends Student
{
	int sem_I_Marks,sem_II_Marks;
	Scanner sc=new Scanner(System.in);
	public void read()
	{
		super.read();
		System.out.println("Enter Semester I Marks:");
		sem_I_Marks=sc.nextInt();
		System.out.println("Enter Semester II Marks:");
		sem_II_Marks=sc.nextInt();	
	}
}
interface Sports
{
	int score();
}
class Result extends Test implements Sports
{
	public int score()
	{
		return 90;  //marks of sports
			
	}
	public void displayResult()
	{
		System.out.println("****Student Result****");
		System.out.println("Roll Number:"+rollNo);
		System.out.println("Sem-I Marks: "+sem_I_Marks+" & Sem II marks:"+sem_II_Marks);
		System.out.println("Sports Score:"+score());
		int total=sem_I_Marks+sem_II_Marks+score();
		System.out.println("Total marks:"+total);
            }
}
class Main
{
	public static void main(String args[])
	{
	    System.out.println("Advay Sharma 60009220147");
	     Result rs=new Result();
                 rs.read();
                 rs.displayResult();
}
}
