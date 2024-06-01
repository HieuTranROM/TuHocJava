import java.util.ArrayList;
import java.util.Scanner;

public class bai28_bt29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so phan tu cua list: ");
        int n = Integer.parseInt(sc.nextLine());
        //cho nguoi dung nhap tung phan tu
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Moi nhap vao phan tu thu " + (i + 1));
            int soNhap = sc.nextInt();
            lst.add(soNhap);
        }
        //in ra danh sach list
        System.out.println(lst);

        //1. tao ra 1 list moi binh phuong cac phan tu
        ArrayList<Integer> binhPhuong = new ArrayList<>();
        for (int x : lst) {
            binhPhuong.add(x * x);
        }
        System.out.println("Danh sach moi la: ");
        System.out.println(binhPhuong);

        //2. Xac dinh bao nhieu phan tu lon hon 50
        int cout = 0;
        for (int x : binhPhuong) {
            if (x > 50) {
                cout++;
            }
        }
        System.out.println("So luong phan tu lon hon 50 la: " + cout);
    }
}
