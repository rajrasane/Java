import java.util.Scanner;

public class JavaPatternsUsingLoops {
    public static void main(String[] args) {
        pattern5();
    }

    // Pattern 1
    public static void pattern1(){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        
        System.out.println("Enter how many lines of pattern you want to print :- ");
        n = sc.nextInt();

        sc.close();

        System.out.println("Pattern :- ");

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 2
    public static void pattern2(){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        
        System.out.println("Enter how many lines of pattern you want to print :- ");
        n = sc.nextInt();

        System.out.println("Pattern :- ");

        for(i=0;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 3
    public static void pattern3(){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        
        System.out.println("Enter how many lines of pattern you want to print :- ");
        n = sc.nextInt();

        System.out.println("Pattern :- ");

        for(i=0;i<=n;i++){
            for(j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Pattern 4
    public static void pattern4(){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        
        System.out.println("Enter how many lines of pattern you want to print :- ");
        n = sc.nextInt();

        System.out.println("Pattern :- ");

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pattern 5
    public static void pattern5(){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        char ch = 'A';
        
        System.out.println("Enter how many lines of pattern you want to print :- ");
        n = sc.nextInt();

        System.out.print("Pattern :- ");

        for(i=0;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
