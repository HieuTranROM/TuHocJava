public class bai8_toantugan {
    public static void main(String[] args) {
        //gan cong
        int x = 8;
        x +=5; //x = x + 5
        System.out.println("x=" +x);

        //gan tru
        int x2 = 8;
        x2 -=5; //x2=x2-5
        System.out.println("x2=" +x2);

        //gan nhan
        int x3=8;
        x3*=5;
        System.out.println("x3=" +x3);

        int a = 6;
        a +=3;
        System.out.println("a=" +a);
        a -=5;
        System.out.println("a=" + a);
        a*=2;
        System.out.println("a=" + a);
        a%=5;
        System.out.println("a=" + a);
        int b =2;
        System.out.println("a=" + (a -=(b+7)));
    }
}
