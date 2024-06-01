import java.util.Scanner;

public class bai26_vidu1 {
    public static void main(String[] args) {
        //nhap vao 1 chuoi 1 tu ban phim
        //dem co bao nhieu ki tu thuong
        //bao nhieu ki tu in hoa
        //bao nhieu khoang ttrang
        // bao nhieu so
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi cu nhap chuoi: ");
        //doc du lieu va gan vao bien
        String s = sc.nextLine();
        //gan bien dem = 0
        int demSo = 0;
        int demInThuong = 0;
        int demInHoa = 0;
        int demKhoangTrang = 0;
        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                demInThuong++;
            } else if (Character.isUpperCase(c)) {
                demInHoa++;
            } else if (Character.isDigit(c)) {
                demSo++;
            } else if (Character.isWhitespace(c)) {
                demKhoangTrang++;
            }
        }
        System.out.println("So luong ky tu thuong: " + demInThuong);
        System.out.println("So luong ky tu hoa: " + demInHoa);
        System.out.println("So luong ky tu so: " + demSo);
        System.out.println("So luong khoang trang: " + demKhoangTrang);
    }
}
