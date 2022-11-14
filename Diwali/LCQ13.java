import java.util.*;

class LCQ13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		int n = sc.nextInt();
		char c = 'A';
		
		for(int i=1; i<=n; i++)
		{
			for(int k=n-i; k>0; k--)
			{
				System.out.print(" ");
			}
			System.out.print(c);
			if(i!=1)
			{
				for(int k=0; k<=2*(i-2); k++)
				{
					System.out.print(" ");
				}
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
		c--;
		for(int i=1; i<n; i++)
		{
			c--;
			for(int k=1; k<=i; k++)
			{
				System.out.print(" ");
			}
			System.out.print(c);
			if(i!=n-1)
			{
				for(int k=2*(n-i-2); k>=0; k--)
				{
					System.out.print(" ");
				}
				System.out.print(c);
			}
			System.out.println();
		}
	}
}