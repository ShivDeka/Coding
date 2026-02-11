
import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        double p= 3.14;
        double r;
        double h;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter shape (1. cone, 2.cylinder, 3.hemisphere): ");
        int choice=sc.nextInt();

        if (choice==1){
            r=sc.nextInt();
            h=sc.nextInt();
            double v= p*r*r*h/3;
            System.out.println("volume of cone: "+ v);
        }else if (choice==2){
            r=sc.nextInt();
            h=sc.nextInt();
            double v= p*r*r*h;
            System.out.println("volume of cylinder: "+ v);
        }else if (choice==1){
            r=sc.nextInt();
            h=sc.nextInt();
            double v= p*r*r*r*2/3;
            System.out.println("volume of hemishpere: "+ v);
        }else{
            System.out.println("invalid choice!!!");
        }
}    }

