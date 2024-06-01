import java.util.Scanner;

public class bai17_17_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //check dieu kien
        while (true) {
            System.out.println("Nhap so nguyen a: ");
            int a = sc.nextInt();
            while (a <= 0) {
                System.out.println("Nhap lai a, a > 0");
                a = sc.nextInt();
            }
            System.out.println("Ban da nhap a thanh cong, a = " + a);
            //ktr so nguyen to
            int demUoc = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    demUoc++;
                }
            }
            if (demUoc == 2) {
                System.out.println(a + " la so nto");
            } else {
                System.out.println(a + " khong phai la so nto");
            }
            System.out.println("ban co thoat khong, bam y de thoat: ");
            String traLoi = new Scanner(System.in).nextLine();
            if (traLoi.equals("y") || traLoi.equals("Y"))
                break;
        }
    }

}
