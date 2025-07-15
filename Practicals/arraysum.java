import java.util.Scanner;

public class arraysum
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many elements you want in both array :- ");
		int n = sc.nextInt();
	
		int a1[] = new int[n];
		int a2[] = new int[n];

		System.out.println("\nEnter " + n + " elements for Array 1");
		for(int i=0;i<n;i++)
		{
			a1[i] = sc.nextInt();
		}
		
		System.out.println("\nEnter " + n + " elements for Array 2");
		for(int i=0;i<n;i++)
		{
			a2[i] = sc.nextInt();
		}

		System.out.println("\nEntered array elements for array1 are :- ");
		for(int i=0;i<n;i++){
			System.out.print(a1[i] + " ");
		}
		
		System.out.println("\nEntered array elements for array2 are :- ");
		for(int i=0;i<n;i++){
			System.out.print(a2[i] + " ");
		}
		
		System.out.println("\n\nSum of these array is ");
		
		int sum[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			sum[i] = a1[i] + a2[i];
		}

		for(int i=0;i<n;i++)
		{
			System.out.print( sum[i] + " ");
		}

		System.out.println();

		sc.close();
	}
}
