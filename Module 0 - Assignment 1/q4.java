import java.util.Scanner;

class q4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before awapping a is "+a+" and b is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After awapping a is "+a+" and b is "+b);
	}
}