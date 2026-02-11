import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first term a: ");
        int a= sc.nextInt();
        System.out.println("enter common diff d: ");
        int d= sc.nextInt();
        System.out.println("enter nth term n: ");
        int n= sc.nextInt();
        
        int series=0;
        for( int i =0; i<=n; i++ ){
             series= a+(i-1)*d;
             System.out.print(series+"  ");

        }

    }
}
