package TinhDaHinh;

public abstract class NhanSu {
    //them cac thuoc tinh
    private String ten;
    private String cccd;
    private String que;

    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }

    public NhanSu() {
    }

    public abstract double tinhLuong(int ngayCong);

    public String getTen() {
        return ten;
    }

    public String getCccd() {
        return cccd;
    }

    public String getQue() {
        return que;
    }
}
