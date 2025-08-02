import java.util.Scanner;
public class strop2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        String[] newstr = str.split("is");
        int count=0;
        for(int i=0;i<newstr.length;i++){
            if(!newstr[i].contains("is")){ 
                count += 1;
            }
        }
        System.out.println("is found " + (count-1) + " times");
        sc.close();
    }
}


