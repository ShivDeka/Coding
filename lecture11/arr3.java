import java.util.Scanner;

public class arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        maxArr(arr);
        minArr(arr);
    }
    public static void maxArr(int arr[]){
        int temp=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }
    public static void minArr(int arr[]){
        int temp=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<temp){
                temp=arr[i];
            }else{
                continue;
            }
        }
        System.out.println(temp);
    }
}
