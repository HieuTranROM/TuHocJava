public class bai26_2_xulychuoilaptrinh {
    public static void main(String[] args) {
        //buoi 2:
        //7.5 IndexOf: Kiem tra vi tri xuat hien dau tien cua ky tu hoac chuoi
        //tra ve -1 neu khong tim thay
        String s7 = "toi di tim toi";
        System.out.println(s7.indexOf("toi"));
        //7.6 lastIndexOf: tra ve vi tri index xuat hien cuoi cung cua ky tu hoac chuoi
        //tra ve -1 neu khong tim thay
        System.out.println(s7.lastIndexOf("toi"));

        //7.7 Contains: kiem tra chuoi con
        String s9 = ".mp3";
        String s10 = "tuhoc.mp3";
        //kiem tra s10 co chua cum string cua s9 ko?
        boolean check = s10.contains(s9);
        if (check)
            System.out.println("co .mp3 trong chuoi");
        else
            System.out.println("Khong tim that .mp3 trong chuoi");

        //7.8 Substring: Trich loc chuoi con tu chuoi ban dau
        //substring(int beginIndex)
        //substring(int beginIndex, int endIndex)
        String s11 = "abcdefgh";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);
        String s13 = s11.substring(4, 7);
        System.out.println(s13);

        //7.9 replace("str old","str new")
        String s14 = "Toi di tim Toi";
        String s15 = s14.replace("Toi", "Ban");
        System.out.println(s14);
        System.out.println(s15);

        //7.10 replaceFirst("str old","str new")
        String s16 = s14.replaceFirst("Toi", "Ban");
        System.out.println(s14);
        System.out.println(s16);

        //7.11 trim(): Xoa toan bo khoang trang o dau va cuoi
        String s18 = "                      Ga lai lap trinh         ";
        String s19 = s18.trim();
        System.out.println(s19);

        //7.12 trim(): Xoa toan bo khoang trang o cuoi
        //cach1: bieu thuc chinh quy (regular expression)
        //dung \s+$ de xoa tat ca cac khoang trang o cuoi chuoi
        String s20 = s18.replaceAll("\\s+$", "");
        System.out.println(s18);
        System.out.println(s20);
        System.out.println(s18.length());
        System.out.println(s20.length());

        //cach2: Xoa khoang trang cuoi chuoi bang vong lap
        String s21 = "                Ga lai lap trinh             ";
        while (s21.endsWith(" ")) {
            s21 = s21.substring(0, s21.length() - 1);
        }
        System.out.println(s21);

        //7.13 trim(): Xoa toan bo khoang trang o dau
        //cach 1: bieu thuc chinh quy (regular expression)
        //dung ^\\s+ de xoa tat ca cac khoang trang o dau chuoi
        String s23 = "                      Ga lai lap trinh         ";
        String s24 = s23.replaceFirst("^\s+", "");
        System.out.println(s24);

        //cach 2: xoa khoang trang dau chuoi bang vong lap
        String s25 = "                      Ga lai lap trinh         ";
        while (s25.startsWith("")) {
            s25 = s25.substring(1);
        }
        System.out.println(s25);
    }
}
