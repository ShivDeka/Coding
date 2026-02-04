import java.util.Scanner;
public class gradeCard {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int g= sc.nextInt();
        if (g>90){
            System.out.println("outstanding");
        }
        else if (g>80 && g<90) {
            System.out.println("excellent");
        }
        else if (g>60 && g<80) {
            System.out.println("very good");
        }
        else if (g>40 && g<60) {
            System.out.println("good");
        }
        else if (g>25 && g<40) {
            System.out.println("poor");
        }else{ 
            System.out.println("fail");
        }
    }
    
}
