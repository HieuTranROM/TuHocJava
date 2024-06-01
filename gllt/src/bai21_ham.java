public class bai21_ham {
    public static void main(String[] args) {
        int kq = Cong(1, 2, 3);
        System.out.println(kq);
        //goi ham chao xin
        Xinchao("female");

    }

    public static int Cong(int x, int y, int z) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        return x + y + z;
    }

    //ham thu tuc
    public static void Xinchao(String gioitinh) {
        if (gioitinh.equals("female")) {
            System.out.println("Xin chao, toi la nhan vien nu");
        } else if (gioitinh.equals("male")) {
            System.out.println("XIn chao, toi la nhan vien nam");
        } else {
            System.out.println("Toi khong hieu ban nhap gi?");
        }
    }

}