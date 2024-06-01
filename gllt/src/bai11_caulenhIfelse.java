import java.util.Scanner;

public class bai11_caulenhIfelse {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao dtb");
        double dtb = sc.nextDouble();
        //kiem tra dieu kien
        if (dtb >= 8.0 && dtb < 10) {
            System.out.println("Ban xl gioi");
        }
        else if (dtb >=7 && dtb < 8) {
            System.out.println("Ban xl kha");
        } else {
            System.out.println("Ban xl tb");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao tong 2 so: ");
        float tong = sc.nextFloat();
        System.out.println("Nhap vao hieu 2 so: ");
        float hieu = sc.nextFloat();
        System.out.println("Gia tri x can tim la: " + (hieu+tong)/2);
        System.out.println("Gia tri y can tim la: " + (tong - ((hieu+tong)/2)));
    }
}
