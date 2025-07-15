import java.util.Scanner;

public class arraysort
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

		System.out.println("\nUnsorted Array :- ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\nSorted Array :- ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		

		System.out.println();

		sc.close();
	}
}
