import java.util.Scanner;

class S15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern:");
		int n = sc.nextInt();
		System.out.println("*");
		for (int i=1; i<n-1; i++)
		{
			System.out.print("*");
			for (int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int i=1; i<=n; i++)
		{
			System.out.print("*");
		}
	}
}