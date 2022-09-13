import java.util.Scanner;

class q18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		System.out.println("The prime factors of "+n+" are:");
		for (int i=2; i<=n; i++)
		{
			int flag = 0;
			if (n % i == 0)
			{
				for (int j=2; j<i; j++)
				{
					if (i % j == 0)
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					System.out.print(i+" ");
				}
			}
		}
	}
}