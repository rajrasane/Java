import java.util.Scanner;
public class strop1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name (First Middle Last) : ");
        String name = sc.nextLine();
        String[] newstr = name.split(" ");
        System.out.println("-------------------------------------------------");
        System.out.println("Your entered name is : " + name);
        System.out.print("Your name after formatting is : ");
        String first = newstr[0];
        String middle = newstr[1];
        String last = newstr[2];
        System.out.print(last.toLowerCase() + " " +  first.toLowerCase() + " " + middle.substring(0,1).toUpperCase()+middle.substring(1).toLowerCase()  + "\n");
        sc.close();
    }
}