package projectRoot.models;

import java.text.SimpleDateFormat;

// models/BenhAnVIP.java
import java.util.Date;

public class BenhAnVIP extends BenhAn {
    private String loaiVIP;
    private Date thoiHanVIP;

    public BenhAnVIP(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien, String loaiVIP, Date thoiHanVIP) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVIP = loaiVIP;
        this.thoiHanVIP = thoiHanVIP;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + loaiVIP + ","
                + new SimpleDateFormat("dd/MM/yyyy").format(thoiHanVIP);
    }

    // Getters and Setters
    public String getLoaiVIP() {
        return loaiVIP;
    }

    public void setLoaiVIP(String loaiVIP) {
        this.loaiVIP = loaiVIP;
    }

    public Date getThoiHanVIP() {
        return thoiHanVIP;
    }

    public void setThoiHanVIP(Date thoiHanVIP) {
        this.thoiHanVIP = thoiHanVIP;
    }
}
