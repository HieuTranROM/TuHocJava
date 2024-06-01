package CongTy;

public class Test {
    public static void main(String[] args) {
/*        NhanVien nv1 = new NhanVien("nhan vien 1", "Bac Ninh", 123456);
        double luongnv1 = nv1.tinhLuong();
        System.out.println("luong nv1 la: " + luongnv1);*/

        //tao doi tuong la nv hanh chinh
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hanh chinh 1", "Ha Noi", 123456);
        double luonghc1 = hc1.tinhLuong();
        System.out.println("luong hc1 la: " + luonghc1);

        //tao doi tuong la nv di ca
        NhanVienDiCa dc1 = new NhanVienDiCa("Di ca 1", "Dong Ha", 123456);
        double ca1luong = dc1.tinhLuong();
        System.out.println("luong ca1 la: " + ca1luong);

        NhanVienDiCa dc2 = new NhanVienDiCa("Di ca 2", "Tu Son", 444123, 1);
        double ca2luong = dc2.tinhLuong();
        System.out.println("luong ca2 la: " + ca2luong);
        System.out.println(dc2.ca);
    }
}
