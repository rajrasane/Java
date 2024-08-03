import java.util.* ;

public class JavaBasics{
    public static void main(String[] args) {
        
    }

    // Showing output in JAVA
    public static void HelloRaj() {
        System.out.println("Hello Raj");
    }

    // Variables and Datatype
    public static void Variable_Understanding(){
        int a = 10;
        String name = "Raj" ;
        char ch = 'c' ;
        byte c = 127;
        boolean bl = false ;
        short n = 240;
    }

    // Taking input from user and displaying in java
    public static void Input_Understanding() {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        sc.close();

        System.out.println(name);
    }

    // addition program java
    public static void addition_using_input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number :-  ");
        int x = sc.nextInt();

        System.out.println("Enter 2nd number :-  ");
        int y = sc.nextInt();

        int sum = x + y;

        System.out.println("Addition is ");
        System.out.println(sum);
    }

    // multiplication program java
    public static void product_using_input(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value of 1st number :-");
        int x = s.nextInt();

        System.out.println("Enter value of 2nd number :-");
        int y = s.nextInt();

        s.close();

        int prod = x * y;

        System.out.print("Product of two numbers :- ");
        System.out.print(prod);
    }

    // Area of circle program java
    public static void area_of_circle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of radius of circle :- ");
        float r = sc.nextInt();

        sc.close();

        float area_of_circle = 3.14f * (r*r) ;

        System.out.println("Area of Circle for given radius is :- ");
        System.out.println(area_of_circle);

    }

    // Understanding type conversion in java
    public static void typeconversion_and_casting(){
    
        // implicit casting (happens automaticlly)
        int a = 90;
        float b = a; 
        // System.out.println(b);

        // explicit casting
        double x = 3.54;
        int y =  (int) x ;
        // System.out.println(y);
        
    }

    // program for reversing a number
    public static void revnum(){
        int n = 654657657;
        System.out.print("Reversed num = ");
        while(n > 0){
            int last_digit = n%10;
            n = n/10;
            System.out.print(last_digit);
        }
    }
    
    // storing reversed num and then printing it
    public static void revnumber(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n :- ");
        int n = sc.nextInt();

        sc.close();

        int rev = 0;

        while (n > 0) {
            int last_dig = n % 10;
            rev = (rev * 10) + last_dig;
            n /= 10;
        }

        System.out.print("Reversed Number :- ");
        System.out.println(rev);
    }

    // do_while example
    public static void do_while(){
        int cnt = 1;
        do{
            System.out.println("Java");
            cnt++ ;
        }while(cnt <= 10 );
    }

    // break keyword example
    public static void breakeg() {
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(i);
            if(i == 3){
                break;
            }
        }
    }

    // continue example
    public static void continueeg() {
        for(int i = 0; i < 5 ; i++){
            if(i == 2){
                continue;
            }
            System.err.println(i);
        }
    }

    
}