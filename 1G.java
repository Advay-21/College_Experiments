import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Name-Advay Sharma" + "\n" + "Sap Id-60009220147");	
		System.out.print("Enter number of rows: ");
		int n= s.nextInt();
		for (int i=1;i<=n ;i++ ) 
		{
			int k=i;
			for(int j=1; j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(k);
					k--;
				}
				else System.out.print(j);
			}
			System.out.println();
		}
	}
}



