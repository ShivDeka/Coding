public class primeTill100 {
    public static void main(String[] args) {

        for(int j = 2; j <= 100; j++) {
            int p = 1;

            for(int i = 2; i < j; i++) {
                if(j % i == 0) {
                    p = 0;
                    break;
                }
            }

            if(p == 1) {
                System.out.println(j);
            }
        }
    }
}
