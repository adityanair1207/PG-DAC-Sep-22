import java.util.Scanner;

class P8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern:");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++)
		{
			for (int j=n; j>i; j--)
			{
				System.out.print(" ");
			}
			for (int j=n-i+1; j<=n; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}