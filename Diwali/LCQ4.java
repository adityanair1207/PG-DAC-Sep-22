import java.util.*;

class LCQ4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=n-i; j>=0; j--)
			{
				System.out.print(" ");
			}
			System.out.print(1);
			if(i==1)
			{
				System.out.println();
				continue;
			}
			
		}
	}
}