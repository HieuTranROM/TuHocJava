package projectRoot.models;

import java.text.SimpleDateFormat;

// models/BenhAnThuong.java
import java.util.Date;

public class BenhAnThuong extends BenhAn {
    private double phiNamVien;

    public BenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien, double phiNamVien) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + phiNamVien;
    }


    // Getters and Setters
    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }
}

