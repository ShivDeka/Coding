import java.util.Scanner;

public class loteryGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int n=sc.nextInt();
        if (n>= 300 && n<=460){
            System.out.println("You won a Macbook!");
        }else if (n>= 200 && n<=280){
            System.out.println("You won a Kurkure!");
        }else if (n>= 1100 && n<=1500){
            System.out.println("You won a Cycle!");
        }else if (n>= 50 && n<=80){
            System.out.println("You won a Bike!");
        }else{
            System.out.println("Invalid Number!!! please try again!!");
        }            
    } 
}
