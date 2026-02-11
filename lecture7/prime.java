import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        while(num>1){
            int p=1;
            for(int i=2; i<num; i++){
                if(num%i==0){
                    p=0;
                    break;
                }
            }
            if(p==1){
                System.out.println(num);
            }
            num--;
        }
    }
}
