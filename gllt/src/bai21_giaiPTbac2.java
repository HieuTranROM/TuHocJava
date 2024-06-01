import java.util.Scanner;

public class bai21_giaiPTbac2 {
    public static void main(String[] args) {
        //ham giai pt bac 2
        String kq = giaiPTB2(1, 2, 3);
        String kq2 = giaiPTB2(1, 2, 1);
        String kq3 = giaiPTB2(1, 2, -3);
        System.out.println(kq);
        System.out.println(kq2);
        System.out.println(kq3);

        //nang cao: cho nguoi dung nhap vao
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so a: ");
        double x = sc.nextDouble();
        System.out.println("Moi nhap so b: ");
        double y = sc.nextDouble();
        System.out.println("Moi nhap so c: ");
        double z = sc.nextDouble();
        String kq4 = giaiPTB2(x, y, z);
        System.out.println(kq);
    }

    public static String giaiPTB2(double a, double b, double c) {
        //neu a = 0 thi phuong trinh tro thanh phuong trinh bac nhat bx + c = 0
        if (a == 0) {
            if (b == 0 && c == 0) {
                return "Phuong trinh bac nhat vo so nghiem";
            } else if (b == 0 && c != 0) {
                return "Phuong trinh vo nghiem";
            } else {
                return "Phuong trinh bac nhat co nghiem: " + (-c / b);
            }
        } else {
            //giai ptb2
            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                return "PT bac 2 VN";
            } else if (delta == 0) {
                double x = -b / (2 * a);
                return "PT bac 2 co nghiem kep x=" + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "pt bac 2 co 2 nghiem pb x1=" + x1 + " ;x2=" + x2;
            }
        }
    }
}
