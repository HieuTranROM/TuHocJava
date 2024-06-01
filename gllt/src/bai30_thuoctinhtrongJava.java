import TruongDaiHoc.SinhVien;

public class bai30_thuoctinhtrongJava {
    public static void main(String[] args) {
        //khoi tao doi tuong thuoc class sinhvien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        SinhVien sv3 = new SinhVien("teo");
        SinhVien sv4 = new SinhVien("Hieu", 10.0);
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        sv3.hienThiThongTin();
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        sv4.setHoTen("Black");
        sv4.setDiem(30);
        sv4.hienThiThongTin();
        //test phuong thuc co kieu tra ve
        double dtbsv4 = sv4.tinhDTB(7.5, 5.4);
        System.out.println(dtbsv4);

        //test phuong thuc toString
        System.out.println(sv4);

        //11. support method va service method
        sv4.checkHopLeDiem();

        //12. overloading
        double test0 = sv4.tinhDTB(5, 6, 7);
        System.out.println(test0);
        double test1 = sv4.tinhDTB(5, 6);
        System.out.println(test1);

        //13.
        double kq = sv4.tongDiem(1, 2, 3, 4, 5, 6, 10);
        System.out.println(kq);

    }
}
