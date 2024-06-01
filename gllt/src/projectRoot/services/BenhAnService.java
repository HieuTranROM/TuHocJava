package projectRoot.services;

// services/BenhAnService.java

import projectRoot.models.BenhAn;
import projectRoot.models.BenhAnThuong;
import projectRoot.models.BenhAnVIP;
import projectRoot.models.DuplicateMedicalRecordException;
import projectRoot.repositories.BenhAnRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BenhAnService {
    private BenhAnRepository repository;

    public BenhAnService() {
        this.repository = new BenhAnRepository();
    }

    public List<BenhAn> getAllBenhAn() {
        return repository.getAll();
    }

    public void addBenhAnThuong(String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, double phiNamVien) throws   ParseException, DuplicateMedicalRecordException {
        int soThuTu = repository.getAll().size() + 1;
        Date ngayNhap = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhapVien);
        Date ngayRa = new SimpleDateFormat("dd/MM/yyyy").parse(ngayRaVien);
        BenhAn benhAn = new BenhAnThuong(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhap, ngayRa, lyDoNhapVien, phiNamVien);
        repository.addBenhAn(benhAn);
    }

    public void addBenhAnVIP(String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVIP, String thoiHanVIP) throws DuplicateMedicalRecordException, ParseException {
        int soThuTu = repository.getAll().size() + 1;
        Date ngayNhap = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhapVien);
        Date ngayRa = new SimpleDateFormat("dd/MM/yyyy").parse(ngayRaVien);
        Date thoiHan = new SimpleDateFormat("dd/MM/yyyy").parse(thoiHanVIP);
        BenhAn benhAn = new BenhAnVIP(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhap, ngayRa, lyDoNhapVien, loaiVIP, thoiHan);
        repository.addBenhAn(benhAn);
    }

    public void deleteBenhAn(String maBenhAn) {
        repository.deleteBenhAn(maBenhAn);
    }
}
