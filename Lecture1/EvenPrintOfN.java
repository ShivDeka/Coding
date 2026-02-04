import java.util.*;
public class EvenPrintOfN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        for ( int i = 1; i<=num; i++){
            if (i%2==0){
            System.out.println(i);
            }
        }



    }
    
}
