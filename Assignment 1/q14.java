import java.util.Scanner;

class q14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int g = 1;
		for (int i=2; i<=x && i<=y; i++)
		{
			if (x%i == 0 && y%i == 0)
			{
				g = i;
			}
		}
		System.out.println("The GCD of "+x+" and "+y+" is "+g);
	}
}