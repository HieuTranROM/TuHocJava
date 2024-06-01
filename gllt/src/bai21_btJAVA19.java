import java.util.Scanner;

public class bai21_btJAVA19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so a:");
        double a = sc.nextDouble();
        System.out.println("Moi nhap vao so b:");
        double b = sc.nextDouble();
        //cho n guoi dung nhap phep tinh
        System.out.println("Moi ban nhap phep tinh: +-*/ ");
        //khai bao bien scanner rieng cho doc chuoi
        Scanner scString = new Scanner(System.in);
        String phepTinh = scString.nextLine();
        switch (phepTinh) {
            case "+":
                cong(a, b);
                break;
            case "-":
                tru(a, b);
                break;
            case "*":
                nhan(a, b);
                break;
            case "/":
                chia(a, b);
                break;
            default:
                System.out.println("Phim bam khong hop le");
                break;
        }
    }

    public static void cong(double a, double b) {
        double kq = a + b;
        System.out.println("kq= " + kq);
    }

    public static void tru(double a, double b) {
        double kq = a - b;
        System.out.println("kq= " + kq);
    }

    public static void nhan(double a, double b) {
        double kq = a * b;
        System.out.println("kq= " + kq);
    }

    public static void chia(double a, double b) {
        if (b == 0) {
            System.out.println("0 lam sao chia ma oi");
        } else {
            double kq = a / b;
            System.out.println("kq= " + kq);
        }
    }
}
