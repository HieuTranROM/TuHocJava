package projectRoot.view;

import projectRoot.models.BenhAn;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    public int showMainMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Thêm mới bệnh án");
        System.out.println("2. Xóa bệnh án");
        System.out.println("3. Xem danh sách bệnh án");
        System.out.println("4. Thoát");
        System.out.print("Chọn chức năng: ");
        return scanner.nextInt();
    }

    public void showBenhAnList(List<BenhAn> benhAnList) {
        for (BenhAn benhAn : benhAnList) {
            System.out.println(benhAn);
        }
    }

    public String getMaBenhAn() {
        System.out.print("Nhập mã bệnh án: ");
        return scanner.next();
    }

    public String confirmDelete() {
        System.out.print("Bạn có chắc chắn muốn xóa bệnh án này? (Yes/No): ");
        return scanner.next();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public String getMaBenhNhan() {
        System.out.print("Nhập mã bệnh nhân: ");
        return scanner.next();
    }

    public String getTenBenhNhan() {
        System.out.print("Nhập tên bệnh nhân: ");
        return scanner.next();
    }

    public String getNgayNhapVien() {
        System.out.print("Nhập ngày nhập viện (dd/MM/yyyy): ");
        return scanner.next();
    }

    public String getNgayRaVien() {
        System.out.print("Nhập ngày ra viện (dd/MM/yyyy): ");
        return scanner.next();
    }

    public String getLyDoNhapVien() {
        System.out.print("Nhập lý do nhập viện: ");
        return scanner.next();
    }

    public double getPhiNamVien() {
        System.out.print("Nhập phí nằm viện: ");
        return scanner.nextDouble();
    }

    public String getLoaiVIP() {
        System.out.print("Nhập loại VIP (VIP I, VIP II, VIP III): ");
        return scanner.next();
    }

    public String getThoiHanVIP() {
        System.out.print("Nhập thời hạn VIP (dd/MM/yyyy): ");
        return scanner.next();
    }
}
