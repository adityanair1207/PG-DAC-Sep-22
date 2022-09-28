import java.util.Scanner;

class PP5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern:");
		int n = sc.nextInt();
		System.out.println("*");
		for (int i=1; i<=n; i++)
		{
			for (int j=n-i; j>=1; j--)
			{
				System.out.print(" ");
			}
			for (int j=n-i+1; j<=n; j++)
			{
				System.out.print(j);
			}
			for (int j=n-1; j>n-i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}