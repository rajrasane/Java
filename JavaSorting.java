import java.util.Scanner;

public class JavaSorting {
    public static void main(String[] args) {
        bubblesort();
    }
    public static void bubblesort(){
        Scanner sc = new Scanner(System.in);
        int a[] = {5,4,1,3,2};

        System.out.println("Array elements before sorting :- ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\nArray elements after sorting (Ascending):- ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\nArray elements after sorting (Descending):- ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
