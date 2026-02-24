
import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        
    }
    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int min=i;
            for(int j =i+1 ; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min=j;
                }
            } 
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    }
    