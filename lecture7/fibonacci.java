import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a =0;
        int b=1;
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1; i<=num; i++){
            System.out.println(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
