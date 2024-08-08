import java.util.Scanner;

public class JavaArrays {
    public static void main(String[] args) {
        // // array 1 declaration
        // int marks[] = new int[20];

        // // array 2 declaration + initialization
        // String fruits[] = {"apple" , "mango" , "banana"};

        // // Initializing array 1
        // marks[0] = 3;
        // marks[1] = 4;
        // marks[2] = 5;
        
        // // displaying both array
        // System.out.println("Array :- "+marks[0]+ "," + marks[1] + "," + marks[2]);

        // System.out.print("Fruits array :- " + fruits[0] + "," + fruits[1] + "," + fruits[2]);

        int index = linearsearch(10);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Element found at index " + index);
        }

    }

    // input in array 
    public static void input(){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        int n;

        System.out.print("Enter how many array elements you want to enter :- ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " array elements :- ");
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Your entered array elements are :- ");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }

    public static int linearsearch(int key){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        int n;

        System.out.print("Enter how many array elements you want to enter :- ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " array elements :- ");
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }

        sc.close();

        System.out.println();

        for(int i=0;i<n;i++){
            if(a[i]==key){
                return i;
            }
        }

        return -1;
    }
}
