import java.util.*;
public class sumOddNum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        for ( int i = 1; i<=num; i++){
            if (i%2!=0){
                sum+=i;
            }
        }System.out.println("Sum of odd numbers: "+sum);
    } 
}
