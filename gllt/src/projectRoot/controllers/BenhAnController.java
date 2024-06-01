package projectRoot.controllers;

import projectRoot.models.DuplicateMedicalRecordException;
import projectRoot.repositories.BenhAnRepository;
import projectRoot.services.BenhAnService;
import projectRoot.models.BenhAn;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import static projectRoot.repositories.BenhAnRepository.isBenhAnExist;

public class BenhAnController {
    private BenhAnService service;
    private Scanner scanner;

    public BenhAnController() {
        this.service = new BenhAnService();
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Thêm mới bệnh án");
            System.out.println("2. Xóa bệnh án");
            System.out.println("3. Xem danh sách bệnh án");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    themMoiBenhAn();
                    break;
                case 2:
                    xoaBenhAn();
                    break;
                case 3:
                    xemDanhSachBenhAn();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ!");
            }
        }
    }

    private void themMoiBenhAn() {
        try {
            String maBenhAn;
            while (true) {
                System.out.print("Nhập mã bệnh án (BA-XXX): ");
                maBenhAn = scanner.nextLine();
                if (maBenhAn.matches("BA-\\d{3}")) {
                    break;
                } else {
                    System.out.println("Mã bệnh án không hợp lệ! Vui lòng nhập lại theo định dạng BA-XXX với XXX là các kí tự số.");
                }
            }

            String maBenhNhan;
            while (true) {
                System.out.print("Nhập mã bệnh nhân (BN-XXX): ");
                maBenhNhan = scanner.nextLine();
                if (maBenhNhan.matches("BN-\\d{3}")) {
                    break;
                } else {
                    System.out.println("Mã bệnh nhân không hợp lệ! Vui lòng nhập lại theo định dạng BN-XXX với XXX là các kí tự số.");
                }
            }

            System.out.print("Nhập tên bệnh nhân: ");
            String tenBenhNhan = scanner.nextLine();
            System.out.print("Nhập ngày nhập viện (dd/MM/yyyy): ");
            String ngayNhapVien = scanner.nextLine();
            System.out.print("Nhập ngày ra viện (dd/MM/yyyy): ");
            String ngayRaVien = scanner.nextLine();
            System.out.print("Nhập lý do nhập viện: ");
            String lyDoNhapVien = scanner.nextLine();

            System.out.print("Loại bệnh án (1-Thường, 2-VIP): ");
            int loaiBenhAn = Integer.parseInt(scanner.nextLine());

            if (loaiBenhAn == 1) {
                System.out.print("Nhập phí nằm viện: ");
                double phiNamVien = Double.parseDouble(scanner.nextLine());
                service.addBenhAnThuong(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
            } else if (loaiBenhAn == 2) {
                System.out.print("Nhập loại VIP (VIP I, VIP II, VIP III): ");
                String loaiVIP = scanner.nextLine();
                System.out.print("Nhập thời hạn VIP (dd/MM/yyyy): ");
                String thoiHanVIP = scanner.nextLine();
                service.addBenhAnVIP(maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVIP, thoiHanVIP);
            } else {
                System.out.println("Loại bệnh án không hợp lệ!");
            }
        } catch (DuplicateMedicalRecordException e) {
            System.out.println(e.getMessage());
        } catch (ParseException e) {
            System.out.println("Định dạng ngày không hợp lệ!");
        } catch (NumberFormatException e) {
            System.out.println("Định dạng số không hợp lệ!");
        }
    }

    private void xoaBenhAn() {
        System.out.print("Nhập mã bệnh án cần xóa: ");
        String maBenhAn = scanner.nextLine();

        // Kiểm tra sự tồn tại của mã bệnh án trong danh sách bệnh án
        if (!isBenhAnExist(maBenhAn)) {
            System.out.println("Mã bệnh án không tồn tại!");
            return;
        }

        System.out.print("Bạn có chắc chắn muốn xóa bệnh án này không? (Yes/No): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Yes")) {
            try {
                BenhAnRepository.deleteBenhAn(maBenhAn);
                System.out.println("Xóa bệnh án thành công!");

                // Hiển thị lại danh sách bệnh án sau khi xóa
                List<BenhAn> danhSachBenhAn = BenhAnRepository.getDanhSachBenhAn();
                System.out.println("Danh sách bệnh án sau khi xóa:");
                for (BenhAn benhAn : danhSachBenhAn) {
                    System.out.println(benhAn.toCSV());
                }
            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra khi xóa bệnh án: " + e.getMessage());
            }
        } else {
            System.out.println("Hủy bỏ thao tác xóa.");
        }
    }



    private void xemDanhSachBenhAn() {
        List<BenhAn> danhSach = service.getAllBenhAn();
        for (BenhAn benhAn : danhSach) {
            System.out.println(benhAn.toCSV());
        }
    }
}
