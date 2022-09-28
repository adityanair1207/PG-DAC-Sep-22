import java.util.Scanner;

class q17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int rev = 0, temp=n, dig=0;
		while (temp > 0)
		{
			dig = temp % 10;
			rev = (rev * 10) + dig;
			temp = temp/10;
		}
		if (rev == n)
		{
			System.out.println(n+" is a palindrome");
		}
		else 
		{
			System.out.println(n+" is NOT a palindrome");
		}
	}
}