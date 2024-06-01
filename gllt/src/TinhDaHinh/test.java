package TinhDaHinh;

public class test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("Hieu", "5555", "Ha Noi");
        //xuat luong pho phong
        System.out.println(ns1.tinhLuong(21));
        System.out.println(ns1.getTen() + " " + ns1.getCccd());
        //thay doi chuc vu
        ns1 = new TruongPhong(ns1.getTen(), ns1.getCccd(), ns1.getQue());
        //in luong ns 1 khi lam tp
        System.out.println(ns1.tinhLuong(21));
        System.out.println(ns1.getTen() + " " + ns1.getCccd());

    }
}
