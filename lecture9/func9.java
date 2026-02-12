import java.util.Scanner;

public class func9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // even();
        int c = even(n);
        System.out.println(c);
    }
    // public static void even(int a){
    //     if(a%2==0){
    //         System.out.println("even");
    //     }
    // }
    public static int even(int n){
        int[] arr={null};
        for(int i=0; i<=n; i++){
            if(i%2==0){
                return i;
            }
        }return -1;
    }}
