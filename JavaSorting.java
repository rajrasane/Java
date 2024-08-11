public class JavaSorting {
    public static void main(String[] args) {
        bubblesort();
    }
    public static void bubblesort(){
        int a[] = {5,4,1,3,2};

        System.out.println("Array elements before sorting :- ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
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

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
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
}
