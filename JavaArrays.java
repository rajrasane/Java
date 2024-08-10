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

        int prices[] = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices)) ;
        
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

    public static void largestarrele(){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        int n;
        

        System.out.print("Enter how many array elements you want to enter :- ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " array elements :- ");
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        int largest = a[0];

        sc.close();

        for(int i = 0;i<n ; i++){
            if(a[i]>largest){
                largest = a[i];
            }
        }

        System.out.println("Largest element in the above array is :- " + largest);
    }

    public static int binarysearch(){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        int n;

        System.out.print("Enter how many array elements you want to enter :- ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " array elements :- ");
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search :- ");
        int ele = sc.nextInt();

        int first = 0;
        int last = n-1;
        int mid = (first + last ) / 2 ;

        sc.close();

        while(first<=last){
            if(a[mid]<ele){
                first ++;
            }
            else if(a[mid]==ele){
                return mid;
            }
            else{
                last--;
            }
            mid = (first+last)/2;
        }

        return -1;
    }

    // Reversing an array
    public static void revarray(){
        int a[] = {1,2,3,4,5,6};

        int n = a.length;
        int first = 0;
        int last = n-1;
        int temp;
        
        System.out.println("Array before reversing :- ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

        while(first<last){
            temp = a[first];
            a[first] = a[last];
            a[last] = temp;
            first++;
            last--;
        }

        System.out.println("\nArray after reversing :- ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    // program to display all possible pairs in the array 
    public static void pairs(){
        int a[] = {1,2,3,4,5,6};
        int n = a.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+a[i]+","+a[j]+") , ");
            }
        }
    }

    // displaying all possile subarrays
    public static void subarrays(){
        int a[] = {2,4,6,8,10};
        int n = a.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();  
            }
            System.out.println();  
        }
    }

    // to find maximum sum of subarrays - Method 1 (Brute Sum)
    public static void maxsumsubarr1(){
        int a[] = {1,-2,6,-1,3};
        int n = a.length;
        int maxsum = Integer.MIN_VALUE;
        

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currsum = 0;
                for(int k = i;k<=j;k++){
                    currsum += a[k];
                }
                // System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum sum := "+maxsum);
    }

    // to find maximum sum of subarrays - Method 2 (Prefix Sum)
    public static void maxsumsubarr2(){
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        int a[] = {2,4,6,8,10};
        int n = a.length;
        int prefix[] = new int[n];

        prefix[0] = a[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + a[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                currsum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }

        System.out.println("Maximum sum :- "+maxsum);
    }

    // to find maximum subarray sum - Method 3 (Kadane's Algorithm)
    public static void maxsumsubarr3(){
        int a[] = {-2,-3,4,-1,-2,1,5,-3};
        int n = a.length;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(currsum + a[i] > 0){
                currsum = currsum + a[i];
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
            else{
                currsum = 0;
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }

        System.out.println("Maximum sum is :- "+maxsum);
    }


    // DSA Leetcode Question.

    // Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

        public static int trap() {
            int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
            int trappedWater = 0;
    
            int lmax[] = new int[height.length];
            lmax[0] = height[0];
            for(int i=1;i<height.length;i++){
                lmax[i] = Math.max(height[i],lmax[i-1]);
            }
    
            int rmax[] = new int[height.length];
            rmax[height.length-1] = height[height.length-1];
            for(int i=height.length-2;i>=0;i--){
                rmax[i] = Math.max(height[i],rmax[i+1]);
            }
    
            for(int i=0;i<height.length;i++){
                int waterLevel = Math.min(rmax[i],lmax[i]);
                trappedWater += waterLevel-height[i];
            }
    
            return trappedWater;
        }


        // You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

        public static int maxProfit(int[] prices) {

            // int max[] = new int[prices.length];
            // int maxprofit = 0;
            // int currdiff;
    
            // for(int i=0;i<prices.length;i++){
            //     max[i] = 0 ;
            //     for(int j=i+1;j<prices.length;j++){
            //         currdiff = prices[j]-prices[i];
            //         if(max[i]<currdiff){
            //             max[i] = currdiff;
            //         }
            //     }
            // }
            // for(int i=0;i<max.length;i++){
            //     if(maxprofit<max[i]){
            //         maxprofit = max[i];
            //     }
            // }
    
            // if(maxprofit>0){
            //     return maxprofit;
            // }
            // else{
            //     return 0;
            // }
            

            // This method has the best time complexity i.e     O(n) .
            int buyprice = Integer.MAX_VALUE;
            int maxprofit = 0;

            for(int i=0;i<prices.length;i++){
                if(buyprice<prices[i]){
                    int profit = prices[i] - buyprice;
                    maxprofit = Math.max(maxprofit, profit);
                }else{
                    buyprice = prices[i];
                }
            }
            return maxprofit;
        }
}
