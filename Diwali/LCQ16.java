import java.util.*;

class LCQ16
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern");
		int n = sc.nextInt();
		
		for(int a=1; a<=2*n; a=a+2)
		{
			for(int i=a; i<=n+a; i++)
			{
				for(int j=i; j<2*n; j++)
					System.out.print(" ");
				for(int k=1; k<=i; k++)
					System.out.print("* ");
				System.out.println();
			}
		}
	}
}