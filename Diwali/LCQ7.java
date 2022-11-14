import java.util.*;

class LCQ7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		int n = sc.nextInt();
		int b = 1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<n+i; j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
}