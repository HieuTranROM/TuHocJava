import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Moi ban nhap ten sinh vien: ");
//        String name = sc.nextLine();
//        System.out.println("Moi ban nhap diem: ");
//        double diem = sc.nextDouble();
//        System.out.println(name + " co diem " + diem);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        int cd = sc.nextInt();
        System.out.println("Nhap chieu rong: ");
        int cr = sc.nextInt();
        double cv = (double) (cd + cr) / 2;
        System.out.println("Chu vi hinh chu nhat =" + cv);
        int dt = cd * cr;
        System.out.println("Dien tich hinh chu nhat =" + dt);
        int cnn = Math.min(cd, cr);
        System.out.println("Canh nho nhat cua hinh chu nhat =" + cnn);
    }
}
