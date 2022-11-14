import java.util.*;

class LCQ11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		int n = sc.nextInt();
		char c = 'A';
		
		for(int i=1; i<=n; i++)
		{
			c = 'A';
			for(int j=n-i; j>=0; j--)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
		for(int i=1; i<n; i++)
		{
			c = 'A';
			for(int j=0; j<=i; j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
	}
}