import java.util.*;

class LCQ12
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
			for(int k=n-i; k>0; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print((c++)+" ");
			}
			System.out.println();
		}
	}
}