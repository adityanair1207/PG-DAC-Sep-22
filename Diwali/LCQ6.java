import java.util.*;

class LCQ6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j>0; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}