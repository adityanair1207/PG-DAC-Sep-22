import java.util.Scanner;

class q19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of even number series:");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++)
		{
			System.out.print(2*i+" ");
		}
	}
}