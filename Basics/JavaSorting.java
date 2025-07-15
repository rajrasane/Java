import java.util.Arrays;

public class JavaSorting {
    public static void main(String[] args) {
        inbuildsortasc();
    }

    // bubble sort
    public static void bubblesort(){
        int a[] = {5,4,1,3,2};

        System.out.println("Array elements before sorting :- ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        for(int i=1;i<a.length;i++){
            for(int j=0;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("\nArray elements after sorting (Ascending):- ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        for(int i=1;i<a.length;i++){
            for(int j=0;j<a.length-i;j++){
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("\nArray elements after sorting (Descending):- ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    // selection sort
    public static void selectionsort(){
        int a[] = {3,2,4,7,5,1};
        int n = a.length;

        System.out.println("Array before sorting :- ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        for(int i=0;i<n-1;i++){
            int minpos = i;
            for(int j=i+1;j<n;j++){
                if(a[minpos]>a[j]){
                    minpos = j;
                }
            }
            int temp = a[minpos];
            a[minpos] = a[i];
            a[i] = temp;
        }

        System.out.println("\nArray after sorting (ascending order) :- ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        for(int i=0;i<n-1;i++){
            int minpos = i;
            for(int j=i+1;j<n;j++){
                if(a[minpos]<a[j]){
                    minpos = j;
                }
            }
            int temp = a[minpos];
            a[minpos] = a[i];
            a[i] = temp;
        }

        System.out.println("\nArray after sorting (descending order) :- ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    // insertion sort
    public static void insertionsort(){
        int arr[] = {7,6,2,4,5};
        int n = arr.length;
        int i,j;

        System.out.println("Array before sorting :- ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        for(i=1;i<n;i++){
            int key = arr[i];
            for(j=i-1;j>=0 && (key<arr[j]);j--){
                arr[j+1]=arr[j];
            }
            arr[j+1] = key;
        }

        System.out.println("\nArray after sorting :- ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // inbluid sort         -- This method has the time complexity of O(n logn)
    public static void inbuildsortasc(){
        int arr[] = {6,4,7,3,5};
        int arr2[] = {5,3,4,2,1};
        int n = arr.length;

        System.out.println("Arrays before sorting :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.println("\nArray after sorting :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nArray 2 before sorting :- ");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i] + " ");
        }

        Arrays.sort(arr2,0,3);

        System.out.println("\nArray 2 after sorting with mentioning of a particular start index + end index");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]  +  " ");
        }
    }
}