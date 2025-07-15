import java.util.Scanner;

public class arrayinp
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

		System.out.println();
		
		sc.close();
	}
}
