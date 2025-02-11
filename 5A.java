import java.util.*;
class Main
{
	static int cal(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}

		else return x*cal(x,n-1);
	}

	public static void main(String[] args) 
	{
     Scanner s= new Scanner(System.in);
     System.out.println("Enter number and power ");
     int num= s.nextInt();
     int pow= s.nextInt();

     int y= cal(num,pow);

     System.out.println("Ans : "+y);

	}
}