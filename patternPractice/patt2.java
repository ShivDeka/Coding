
public class patt2 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1; row<=n; row++){
            //space
            for(int space=1; space<= n - row; space++){
                System.out.print("   ");
            }
            //stars
            for(int star=1; star<=row; star++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
