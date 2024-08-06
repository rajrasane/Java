import java.util.* ;

public class JavaBasics{
    public static void main(String[] args) {
        // primeornot();
        // add(100, 110);              // here a and b are called as arguments or actual parameters
        // swap();
        // fact(5);
        // binomialfact(5, 2);
        // System.out.println("Addition of two numbers is " + addn(2, 4));
        // System.out.println("Addition of three numbers is " + addn(2, 4 , 8));
        // System.out.println(sub(2,1));
        // System.out.println(sub(3.1f,2.1f));
        // System.out.println(checkprime(4));
        primeinrange(20);
    }

    // Showing output in JAVA
    public static void HelloRaj() {
        System.out.println("Hello Raj");
    }

    // Variables and Datatype
    @SuppressWarnings("unused")
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

        sc.close();

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
    @SuppressWarnings("unused")
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

    // ternary operator example
    public static void ternary(){
        int num;
        int n1 = 3;
        int n2 = 5;

        num = n1<n2 ? n1 : n2 ;

        System.out.println(num);
    }

    // print no.s 1 to 10
    public static void printnum(){
        Scanner sc = new Scanner(System.in);
        int i,n;
        
        System.out.println("Enter until how many numbers you want to print :- ");
        n = sc.nextInt();

        sc.close();

        System.out.println("\nNumbers :- ");
        for(i=1;i<=n;i++){
            System.out.println(i);
        }
    }

    // check if number is prime or not 
    public static void primeornot(){
        int i;
        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number you want to check whether it's prime or not :- ");
        int num = sc.nextInt();

        sc.close();

        if(num>0 && num!=1){
            for(i = 2;i<=num-1;i++){
                if(num%i==0){
                    isPrime = false;
                }
            }
        }
        else{
            System.out.println("Number is Prime!");
        }

        if(isPrime==true){
            System.out.println("Number is Prime!");
        }
        else{
            System.out.println("Number is not prime!");
        }
    }

    // using function with parameters 
    public static void add(int a,int b){            // here a and b are called as parameter or formal parameters
        int sum;
        sum = a + b;
        System.out.print("Sum of number :" + a + " and " + b + " is => " + sum);
    }

    // call by value example                    // java always calls by Value
    public static void swap(){
        int a = 5;
        int b = 10;

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("value of a :- " + a);
        System.out.println("value of b :- " + b);
    }

    // program to calculate the factorial of number n 
    public static int fact(int n){
        int fact = 1;

        for(int i= 1;i<=n;i++){
            fact = fact * i;
        }

        return fact;
    }

    // program to find binomial coeefficient nCr = n!/r!*(n-r)!
    public static void binomialfact(int n,int r){
        int bm = fact(n)/(fact(r)*fact(n-r));
        
        System.out.println("Binomial Factorial of " + n + " and " + r + " :- " + bm);
    }

    // Function overlaoding example         i.e function with same name but different no. of parameters
    public static int addn(int a,int b){
        return a + b;
    }

    public static int addn(int a,int b,int c){
        return a + b + c;
    }

    // function overlaoding using datatypes
    public static int sub(int a,int b){
        return a - b;
    }

    public static float sub(float a,float b){
        return a - b;
    }

    // checking prime using more opimized way
    public static boolean checkprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // displaying all prime no.s int the given range
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(checkprime(i)){
                System.out.print(i + " ");
            }
        }
    }
}