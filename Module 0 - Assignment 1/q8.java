import java.util.Scanner;

class q8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		System.out.println("The digits of "+n+" are:");
		while (n > 0)
		{
			System.out.print((n % 10)+" ");
			n = n/10;
		}
	}
}