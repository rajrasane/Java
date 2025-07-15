import java.util.Scanner;

public class arraysum2
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many elements you want in both array :- ");
		int n = sc.nextInt();
	
		int a[] = new int[n];

		System.out.println("\nEnter " + n + " elements for Array");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		

		System.out.println("\nEntered array elements for array are :- ");
		for(int i=0;i<n;i++){
			System.out.print(a[i] + " ");
		}
		
		int sum = 0;
		
		for(int i=0;i<n;i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println("\n\nSum of these array is " + sum + "\n\n");

		sc.close();

	}
}
