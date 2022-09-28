import java.util.Scanner;

class P18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern:");
		int n = sc.nextInt();
		char c = 'A';
		for (int i=1; i<=n; i++)
		{
			c = 'A';
			for (int j=1; j<=n-i+1; j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
}