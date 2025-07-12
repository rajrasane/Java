import java.util.Scanner;
class posneg
{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		if(a>0)
		{
			System.out.println("No is positive");
		}
		else
		{
			System.out.println("No is negative");	
		}
		
	}
}
