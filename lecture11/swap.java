public class swap {
    public static void main(String[] args) {
        int a=23;
        int b=45;
        System.out.println("using temp");
        temp(a,b);

        // System.out.println("using arithmatic operators");
        // arith(a,b);

        System.out.println("using XOR opertor");
        xorOp(a,b);
    }
    public static void temp(int a, int b){
        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

    }
    public static void arith(int a, int b){
        a=a+b;
        b=a-b;
        b=b-a;
        System.out.println(a);
    }
    public static void xorOp(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);


    }
}
