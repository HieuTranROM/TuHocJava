import java.util.Scanner;

public class bai12_12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap diem: ");
        double diem = sc.nextDouble();
        String hanhKiem = (diem >= 8 && diem<10)?"Gioi":(8>diem && diem>=6.5)?"Kha":(diem<6.5 && diem>=5)?"Trung Binh":"Yeu";
        System.out.println("Hanh kiem cua hoc sinh do la: " + hanhKiem);
    }
}
