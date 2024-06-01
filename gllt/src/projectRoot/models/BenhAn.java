package projectRoot.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BenhAn {
    protected int soThuTu;
    protected String maBenhAn;
    protected String maBenhNhan;
    protected String tenBenhNhan;
    protected Date ngayNhapVien;
    protected Date ngayRaVien;
    protected String lyDoNhapVien;

    public BenhAn(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDoNhapVien) {
        this.soThuTu = soThuTu;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    // Getters and Setters
    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public Date getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(Date ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public Date getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(Date ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public String toCSV() {
        // Triển khai phương thức chuyển đổi các thuộc tính của bệnh án thành chuỗi CSV
        return soThuTu + "," + maBenhAn + "," + maBenhNhan + "," + tenBenhNhan + ","
                + new SimpleDateFormat("dd/MM/yyyy").format(ngayNhapVien) + ","
                + new SimpleDateFormat("dd/MM/yyyy").format(ngayRaVien) + ","
                + lyDoNhapVien;
    }
}
