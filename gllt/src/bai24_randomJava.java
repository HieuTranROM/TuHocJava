import java.util.Random;

public class bai24_randomJava {
    public static void main(String[] args) {
        //khoi tao 1 doi tuong ngau nhien
        Random rd = new Random();
        //1. lay ngau nhien 1 so nguyen
        int soNguyen = rd.nextInt(50);
        System.out.println(soNguyen);

        //2. chay ngau nhien so thuc
        double x = rd.nextDouble(100);
        System.out.println(x);
    }
}
