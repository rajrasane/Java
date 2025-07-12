import java.util.Scanner;
class min
{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two number for comparison :- ");
		System.out.println("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int b = sc.nextInt();
		int mini;
		if(a<b)
		{
			mini = a;
		}
		else
		{
			mini = b;	
		}
		System.out.println("Small No :- " + mini);
	}
}
