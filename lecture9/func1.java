import java.util.Scanner;

public class func1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a,b);
        // int c = add(a,b);
    }
    public static void add(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    // public static int add(int a, int b){
    //     int c=a+b;
    //     return c;
    // }
}
