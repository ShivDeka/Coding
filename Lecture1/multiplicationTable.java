import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        System.out.println("Multiplication Table: ");
        for ( int i = 1; i<=10; i++){
            System.out.println(num+ "+"+i+"="+num*i);
        }



    }
    
}
