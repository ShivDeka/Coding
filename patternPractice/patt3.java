public class patt3 {
    public static void main(String[] args) {
        int n=5;
        for(int i = 1; i<=n; i++){
            for ( int space=1; space<=i*2-1; space++){
                System.out.print("  ");
            }
            for( int star =1; star<=i*2-1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        

    }
}