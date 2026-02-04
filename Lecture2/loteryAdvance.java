import java.util.Scanner;

public class loteryAdvance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();

        if (n>= 300 && n<=460){
            System.out.println("You won a Macbook!");
            if (n>= 300 && n<=380){
                System.out.println("Model: M1");
            }else if (n>= 381 && n<=460){
                System.out.println("Model: M2");}    

        }else if (n>= 200 && n<=280){
            System.out.println("You won a Kurkure!");
            if (n>= 200 && n<=240){
                System.out.println("chilli flavour");}
            else if (n>= 241 && n<=280){
                System.out.println("Onion flavour");}

        }else if (n>= 1100 && n<=1500){
            System.out.println("You won a Cycle!");
            if (n>=1100  && n<=1300){
                System.out.println("avon cycle");}
            else if (n>= 1301 && n<=1500){
                System.out.println("Hero Cycle");}

        }else if (n>= 50 && n<=80){
            System.out.println("You won a Bike!");
            if (n>= 50 && n<=65){
                System.out.println("Bullet");}
            else if (n>= 65 && n<=80){
                System.out.println("Rajdoot");}

        }else{
            System.out.println("Invalid Number!!! please try again!!");
        }            
    } 
}
