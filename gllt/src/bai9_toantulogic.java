public class bai9_toantulogic {
    public static void main(String[] args) {
        int i = 15;
        // kiem tra gia tri i>0 va i<10 ko
        System.out.println(i>0 && i < 10);
        //kiem tra xem i>10 hoac i<-1
        System.out.println(i>10 || i<-1);
        //phep phu dinh
        System.out.println(!(i>10 || i<=-1));

        //toan tu tien to hau to
        int x = 100;
        int y = 90;
        int z = 80;
        int t = 70;

        x++; //x = x + 1 tang x len 1 gia tri
        ++y; // tang y len 1 gia tri
        z--;
        --t;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
    }

}
