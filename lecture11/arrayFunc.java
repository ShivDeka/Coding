
import java.util.Scanner;

public class arrayFunc {
    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }printnum(arr);
    } 
    public static void printnum(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }  
}
