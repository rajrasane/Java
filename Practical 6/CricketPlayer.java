// Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns,
// bat_avg).Create an array of n player objects .Calculate the batting average for each
// player using static method avg(). Define a static sort method which sorts the array on
// the basis of average. Display the player details in sorted order.

import java.util.Scanner;

class CricketPlayer{
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int total_runs;
    double bat_avg;

    CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int total_runs){
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.total_runs = total_runs;
        this.bat_avg = 0;
    }

    static void avg(CricketPlayer p[]){
        for(int i=0;i<p.length;i++){
            p[i].bat_avg = p[i].total_runs / (p[i].no_of_innings - p[i].no_of_times_notout);
        }
    }

    static void sort(CricketPlayer p[]){
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p.length-i-1;j++){
                if(p[j].bat_avg < p[j+1].bat_avg){
                    CricketPlayer temp = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp;
                }
            }
        }
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many player records you want :- ");
        int n = sc.nextInt();

        CricketPlayer p[] = new CricketPlayer[n];

        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("Enter player name :- ");
            String name = sc.nextLine();
            System.out.println("Enter no of innings :- ");
            int no_of_innings = sc.nextInt();
            System.out.println("Enter no of times not out :- ");
            int no_of_times_notout = sc.nextInt();
            System.out.println("Enter total runs :- ");
            int total_runs = sc.nextInt();
            System.out.println();

            p[i] = new CricketPlayer(name, no_of_innings, no_of_times_notout, total_runs);
        }

        CricketPlayer.avg(p);

        System.out.println("Unsorted Player Records :- ");
        for(int i=0;i<n;i++){
            System.out.println(p[i].name + " " + p[i].no_of_innings + " " + p[i].no_of_times_notout + " " + p[i].total_runs + " " + p[i].bat_avg);
        }
        
        CricketPlayer.sort(p);

        System.out.println("\nSorted Player Records :- ");
        for(int i=0;i<n;i++){
            System.out.println(p[i].name + " " + p[i].no_of_innings + " " + p[i].no_of_times_notout + " " + p[i].total_runs + " " + p[i].bat_avg);
        }

        sc.close();
    }
}