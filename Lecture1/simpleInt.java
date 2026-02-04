public class simpleInt{
    public static void main(String[] args) {
        int p= 12000;
        int t=2;
        int r=10;
        
        int interest= (p*r*t)/100;
        System.out.println("Simple interest: "+ interest);
        int total_amount= interest+ p;
        System.out.println("Total amount: "+ total_amount);
        
    }
}

