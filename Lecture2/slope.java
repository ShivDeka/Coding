public class slope {
    public static void main(String[] args) {
        int x1= 11;
        int x2= 12;
        int x3= 17;
        int y1= 75;
        int y2= 76;
        int y3= 77;

        int m1= (y2-y1)/(x2-x1);
        int m2= (y3-y2)/(x3-x2);

        if (m1==m2){
            System.out.println(" its a straight line ");
        }else{
            System.out.println("its not a straight line");
        }

    }
}