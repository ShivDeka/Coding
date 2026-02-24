import java.util.Scanner;

public class eleShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");;
        }
        System.out.println();
        // leftShift(arr);
        rightShift(arr);
    }
    public static void leftShift(int arr[]){
        if(arr.length <=1) return;
        int first = arr[0];
        for(int i=0;i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]= first;
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void rightShift(int arr[]){
        if(arr.length <=1) return;
        int last = arr[arr.length-1];
        for(int i=arr.length-1;i>=0; i--){
            arr[i]=arr[i-1];
        }
        arr[arr.length-1]= last;
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
