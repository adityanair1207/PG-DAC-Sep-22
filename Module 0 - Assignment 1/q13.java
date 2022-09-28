import java.util.Scanner;

class q13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int sum = 0, temp=n, dig=0;
		while (temp > 0){
			dig = temp % 10;
			sum = (sum * 10) + dig;
			temp = temp/10;
		}
		System.out.print("The reverse of "+n+" is: "+sum);
	}
}