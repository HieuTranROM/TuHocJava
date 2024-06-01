package projectRoot.repositories;

// repositories/BenhAnRepository.java

import projectRoot.models.BenhAn;
import projectRoot.models.BenhAnThuong;
import projectRoot.models.BenhAnVIP;
import projectRoot.models.DuplicateMedicalRecordException;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class BenhAnRepository {
    private static final String FILE_PATH = "D:\\GaLaiLapTrinhJava\\gllt\\src\\projectRoot\\data\\record.csv";
    private static List<BenhAn> benhAnList = new ArrayList<>();

    public BenhAnRepository() {
        loadFromFile();
    }

    private void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int soThuTu = Integer.parseInt(data[0]);
                String maBenhAn = data[1];
                String maBenhNhan = data[2];
                String tenBenhNhan = data[3];
                Date ngayNhapVien = new SimpleDateFormat("dd/MM/yyyy").parse(data[4]);
                Date ngayRaVien = new SimpleDateFormat("dd/MM/yyyy").parse(data[5]);
                String lyDoNhapVien = data[6];

                if (data.length == 8) {
                    double phiNamVien = Double.parseDouble(data[7]);
                    benhAnList.add(new BenhAnThuong(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien));
                } else if (data.length == 9) {
                    String loaiVIP = data[7];
                    Date thoiHanVIP = new SimpleDateFormat("dd/MM/yyyy").parse(data[8]);
                    benhAnList.add(new BenhAnVIP(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVIP, thoiHanVIP));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<BenhAn> getAll() {
        return benhAnList;
    }

    public static void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (BenhAn benhAn : benhAnList) {
                pw.println(benhAn.toCSV());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addBenhAn(BenhAn benhAn) throws DuplicateMedicalRecordException {
        for (BenhAn ba : benhAnList) {
            if (ba.getMaBenhAn().equals(benhAn.getMaBenhAn())) {
                throw new DuplicateMedicalRecordException("Bệnh án đã tồn tại.");
            }
        }
        benhAnList.add(benhAn);
        saveToFile();
    }

    public static boolean isBenhAnExist(String maBenhAn) {
        for (BenhAn benhAn : benhAnList) {
            if (benhAn.getMaBenhAn().equals(maBenhAn)) {
                return true;
            }
        }
        return false;
    }

    // Xóa bệnh án có mã maBenhAn
    public static void deleteBenhAn(String maBenhAn) {
        benhAnList.removeIf(benhAn -> benhAn.getMaBenhAn().equals(maBenhAn));
        saveToFile();
    }

    // Lấy danh sách bệnh án
    public static List<BenhAn> getDanhSachBenhAn() {
        return benhAnList;
    }
}
