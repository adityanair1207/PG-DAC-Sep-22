import java.util.Scanner;

class PP1{
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
			for (int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}