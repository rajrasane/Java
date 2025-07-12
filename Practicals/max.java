import java.util.Scanner;
class max
{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two number for comparison :- ");
		System.out.println("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int b = sc.nextInt();
		int large;
		if(a>b)
		{
			large = a;
		}
		else
		{
			large = b;	
		}
		System.out.println("Large No :- " + large);
	}
}
