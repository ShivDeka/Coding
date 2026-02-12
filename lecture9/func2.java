import java.util.Scanner;

public class func2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        even(a);
        // int c = even(a);
        // if(==1){
        //     System.out.println("even");}
    }
    public static void even(int a){
        if(a%2==0){
            System.out.println("even");
        }
    }
    // public static int even(int a){
    //     if(a%2==0){
    //          return 1;}
    // 
    // }
}