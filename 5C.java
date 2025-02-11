import java.util.*;
class Complex
{
	float r,i;

	Complex add(Complex c2)
	{
		Complex c3 = new Complex();
		c3.r= r+ c2.r;
		c3.i= i+ c2.i;
		return c3;
	}
	Complex sub(Complex c2)
	{
		Complex c3 = new Complex();
		c3.r= r- c2.r;
		c3.i= i- c2.i;
		return c3;
	}

	void display()
	{
		System.out.println("Result : "+r +"+i("+i+")");
	}
}

class Main
{

	public static void main(String[] args) 
	{
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		

		Scanner s= new Scanner(System.in);

		System.out.println("Enter Real and Img part of 1st Number");
		c1.r= s.nextFloat();
		c1.i= s.nextFloat();

		System.out.println("Enter Real and Img part of 2nd Number");
		c2.r= s.nextFloat();
		c2.i= s.nextFloat();


		System.out.println("Enter Choice \n 1. Addition \n 2.Subtraaction");
		int ch= s.nextInt();

		switch(ch)
		{
			case 1: Complex sum = c1.add(c2);
			
				sum.display();
				break;

			case 2: Complex subt= c1.sub(c2);
				
				subt.display();
				break;

			default: System.out.print("INVALID");

		}






		
	}
}





