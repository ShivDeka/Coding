public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int star = n-1;
        int space = 1;
        int row =1;
        
        while (row<=2*n-1) {
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }

            
            System.out.println();
            if(row<n){
                star --;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }System.out.println();
            row++;
        }
    }
}