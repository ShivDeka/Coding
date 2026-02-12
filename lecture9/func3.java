import java.util.Scanner;

public class func3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // max(a,b);
        int c = max(a,b);
        System.out.println(c);
    }
    // public static void max(int a, int b){
    //     if(a>b){
    //         System.out.println(" a is bigger");
    //     }else{ System.out.println("b is bigger");}
    // }
    public static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}