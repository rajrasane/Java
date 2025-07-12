import java.util.Scanner;
class xraisetoy
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x : ");
		int x = sc.nextInt();
		System.out.println("Enter y : ");
		int y = sc.nextInt();
		int pow=x;
		for(int i=y;i>1;i--){
			pow = x*pow;
		}
		System.out.println(x + " raise to " + y + " = " + pow);
	}
}
