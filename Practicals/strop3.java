public class strop3 {
    public static void main(String[] args) {
        String[] strt;
        String str = "Thisisis is my laptop";
        strt = str.split("is");
        System.out.println("is found " + (strt.length - 1) + " times");
        // for(int i=0;i<strt.length;i++){
        //     System.out.println("'" + strt[i] + "'");
        // }
    }
}
