import java.util.Scanner;

class P10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pattern:");
		int n = sc.nextInt();
		char c = 'E', temp = 'E';
		for (int i=1; i<=n; i++)
		{
			temp = c;
			for (int j=n; j>i; j--)
			{
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++)
			{
				System.out.print(temp+" ");
				temp++;
			}
			c--;
			System.out.println();
		}
	}
}