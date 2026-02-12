import java.util.Scanner;

public class func4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // max(a,b,c);
        int d = max(a,b,c);
        System.out.println(d);
    }
    // public static void max(int a, int b, int c){
    //     if(a>b && a>c){
    //         System.out.println("a is largest");
    //     }else if(b>a && b>c){
    //         System.out.println("b is largest");
    //     }else{
    //         System.out.println("c is largest");
    //     }
    // }
    public static int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }
}