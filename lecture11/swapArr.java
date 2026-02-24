import java.util.Scanner;

public class swapArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        swap(arr);
    }
    public static void swap(int arr[]){
        int j=arr.length-1;
        for(int i=0; i<j; i++){
            
            arr[i]=arr[i]^arr[j];
            arr[j]=arr[i]^arr[j];
            arr[i]=arr[i]^arr[j];
        }
        for(int x: arr){
            System.out.println(x+" ");
        }
    }
}
