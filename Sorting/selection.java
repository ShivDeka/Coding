
import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        
    }
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int item=arr[i];
            int j;
            for( j =i-1 ; j>=0 && arr[j]>item; j--){
                arr[j+1]= arr[j];
            }
            arr[j+1]=item;  
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
