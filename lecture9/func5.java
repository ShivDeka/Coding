import java.util.Scanner;

public class func5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sum(n);
        int sum = natural(n);
        System.out.println(sum);
    }
    // public static void sum(int n){
    //     int sum=0;
    //     for(int i=0; i <=n; i++){
    //         sum +=i;
    //     }System.out.println(sum);
    // }
    public static int natural (int n){
        int sum=0;
        for(int i=0; i <=n; i++){
            sum +=i;
        }return sum;
    }
}