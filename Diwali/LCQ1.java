import java.util.*;

class LCQ1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		int n = sc.nextInt();
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=n-i-1; j>0; j--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			if(i==0)
			{
				System.out.println();
				continue;
			}
			for(int k=0; k<(2*i-1); k++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=0; i<(2*n-1); i++)
			System.out.print("*");
	}
}