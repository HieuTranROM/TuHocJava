package CongTy;

public class NhanVienDiCa extends NhanVien {
    //khai bao them thuoc tinh ca
    //ca1: ngay
    //ca2: dem
    protected int ca;

    public NhanVienDiCa(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }

    public NhanVienDiCa(String ten, String que, int cccd, int ca) {
        super(ten, que, cccd);
        this.ca = ca;
    }


    @Override
    public double tinhLuong() {
        return luongCoBan * 1.05;
    }
}
