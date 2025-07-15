import java.util.Scanner;

public class arraymax
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many elements you want in an array :- ");
		int n = sc.nextInt();
	
		int a[] = new int[n];
		
		System.out.println("\nEnter " + n + " elements");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("\nEntered array elements are :- ");
		for(int i=0;i<n;i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\n\nAmong array max number is :- ");
		int large = a[0];
		for(int i=1;i<n;i++)
		{
			if(large<a[i])
			{
				large = a[i];	
			}
		}
		System.out.print(large);

		System.out.println();

		sc.close();
	}
}
