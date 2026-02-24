
import java.util.Scanner;

public class findEle {
    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter num  to find:  ");
        int n=sc.nextInt();
        printnum(arr,n);
    } 
    public static void printnum(int arr[],int n){
        for(int i=0;i<arr.length; i++){
            if(arr[i]==n){
                System.out.println(arr[i]+ "found at index "+ i);
                break;
            }        }
    }  
}

