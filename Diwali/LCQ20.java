import java.util.*;

class LCQ20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k<=n; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=1; i<n; i++)
		{
			for(int j=n-1; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=n-i; k<=n; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}