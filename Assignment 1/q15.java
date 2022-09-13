import java.util.Scanner;

class q15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int l=1, flag=0;
		for (int i=1; i<=y; i++)
		{
			for (int j=1; j<=x; j++)
			{
				if (x*i == y*j)
				{
					l = x*i;
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		System.out.println("The LCM of "+x+" and "+y+" is "+l);
	}
}