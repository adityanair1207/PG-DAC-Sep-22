import java.util.*;

class LCQ2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		int n = sc.nextInt();
		
		for(int i=0; i<(2*n-1); i++)
			System.out.print("*");
		System.out.println();
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(" ");
			}
			if(i==n-2)
			{
				System.out.println("*");
				break;
			}
			System.out.print("*");
			for(int k=0; k<(n-2*i); k++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}