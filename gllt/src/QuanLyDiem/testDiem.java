package QuanLyDiem;

public class testDiem {
    public static void main(String[] args) {
        //khoi tao dt khoa toan
        KhoaToan toan1 = new KhoaToan("Hoang Van B", "5321412");
        toan1.tinhDTB();

        KhoaAnh anh1 = new KhoaAnh("Ten", "123456");
        anh1.tinhDTB();
    }
}
