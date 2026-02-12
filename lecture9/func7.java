import java.util.Scanner;

public class func7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // reverse(n));
        int r = reverse(n);
        System.out.println(r);
    }
    // public static void reverse(int n){
    //     int rev =0;
    //     while(n!=0){
    //         int digit = n % 10;
    //         rev = rev*10 + digit;
    //         n= n/10;
    //     }
    //     System.out.println(rev);
    // }
    public static int reverse(int n){
        int rev =0;
        while(n!=0){
            int digit = n % 10;
            rev = rev*10 + digit;
            n= n/10;
        }
        return rev;
    }
}