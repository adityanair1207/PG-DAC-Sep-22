import java.util.*;

class LCQ5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		int n = sc.nextInt();
		int k = 0;
		
		for(int i=0; i<n-1; i++)
		{
			k = 0;
			for(int j=1; j<n-i-1; j++)
			{
				System.out.print(" ");
			}
			for(k=i+1; k>0; k--)
			{
				System.out.print(k);
			}
			for(k=k+2; k<=i+1; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=0; i<n-1; i++)
		{
			k = 0;
			for(int j=0; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(k=n-i-2; k>0; k--)
			{
				System.out.print(k);
			}
			for(k=k+2; k<=n-i-2; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}