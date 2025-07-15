import java.util.Scanner;
class fact
{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int facto = 1;

		for(int i=n;i>0;i--)
		{
			facto = facto * i;
		}
		
		System.out.println("factorial of " + n + " is " + facto);

		sc.close();
	}
}
