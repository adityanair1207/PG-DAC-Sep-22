import java.util.Scanner;

class q6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		if (n % 4 == 0)
		{
			System.out.println(n+" is a leap year");
		}
		else 
		{
			System.out.println(n+" is not a leap year");
		}
	}
}