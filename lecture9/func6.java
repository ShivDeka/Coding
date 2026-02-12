import java.util.Scanner;

public class func6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        // interest(p,r,t);
        int i = max(p,r,t);
        System.out.println(i);
    }
    // public static void max(int p, int r, int t){
    //     int i = p*r*t/100;
    //     System.out.println("c is largest");
    //     }
    // }
    public static int max(int p, int r, int t){
        int i = p*r*t/100;
        return i;
    }
}