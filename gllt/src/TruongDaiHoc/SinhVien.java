package TruongDaiHoc;

public class SinhVien {
    //thuoc tinh(giong voi bien)
    private String hoTen;
    private double diem;

    //4. khoi tao contrustor mac dinh

    public SinhVien() {
        hoTen = "No name";
        diem = 0.0;
    }
    //4.2 constructor co doi so


    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    //phuong thuc (cac ham)
    //phuong thuc khong co kieu tra ve
    public void hienThiThongTin() {
        System.out.println(hoTen + " : " + diem);
    }

    //phuong thuc co kieu tra ve
    public double tinhDTB(double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }

    public double tinhDTB(double diemToan, double diemVan, double diemAnh) {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    //pt4
    public double tinhDTB(double diemToan, double diemVan, String abc) {
        return (diemToan + diemVan) / 2;
    }

    public double tinhDTB(String abc, double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }
    //get,set

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    //toString

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    //11.support method va service method
    //11.1. support method
    //ktr diem khi nhap ho so cho sinh vien
    private boolean checkDiem() {
        return this.diem >= 24;
    }

    //12.2 service method co the goi tu chuong trinh chinh
    public void checkHopLeDiem() {
        if (checkDiem())
            System.out.println("Diem hop le, tiep tuc nhap thong tin");
        else
            System.out.println("Kiem tra lai diem dau vao cua sv");
    }

    //parametter list
    public double tongDiem(double... arr) {
        double tong = 0.0;
        for (double x : arr) {
            tong += x;
        }
        return tong;
    }
}
