public class clisort {
    void sort(int a[]) {
        int n = a.length; 
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { 
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String arg[]) {
        clisort obj = new clisort();
        int a[] = new int[5];
        a[0] = Integer.parseInt(arg[0]);
        a[1] = Integer.parseInt(arg[1]);
        a[2] = Integer.parseInt(arg[2]);
        a[3] = Integer.parseInt(arg[3]);
        a[4] = Integer.parseInt(arg[4]);

        System.out.println("Before sorting :- ");
        obj.display(a);

        System.out.println("\n\nAfter sorting :- ");
        obj.sort(a);
        System.out.println();
    }
}

