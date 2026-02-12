import java.util.Scanner;

public class func8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // even();
        int c = even();
        System.out.println(c);}
    }
    // public static void even(int a){
    //     if(a%2==0){
    //         System.out.println("even");
    //     }
    // }
    public static int even(int a){
        for(int i=0; i<=1000; i++){
            if(i%2==0){
                return i;
        }
    }
}