public class bai26_3_compareTo_split_ {
    public static void main(String[] args) {
        //2 chuoi giong nhau
        String s25 = "abc13579";
        String s26 = "abc13579";
        int x = s25.compareTo(s26);
        System.out.println("x=" + x);

        //2 chuoi khac nhau,phan biet hoa thuong
        String s27 = "Abcd13579";
        String s28 = "abcd13579";
        int x2 = s27.compareTo(s28);
        System.out.println("x2=" + x2);

        //so sanh 0 pbiet hoa thuong
        String s29 = "Abc13579";
        String s30 = "abc13579";
        int x3 = s29.compareToIgnoreCase(s30);
        System.out.println("x3=" + x3);

        //7.17 split tach chuoi:
        String s38 = "Hello, world";
        String[] mang = s38.split(", ");
        //duyet mang
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }

        //7.18 toLowerCase() && toUpperCase
        String s39 = "Toi Hoc lap trinh Tai TUHOC.cC";
        String s40 = s39.toLowerCase();
        System.out.println(s40);
        String s41 = s39.toUpperCase();
        System.out.println(s41);

        //7.19 toCharArray() tach chuoi thanh tung ky tu, cho vao mang
        String s42 = "abcedf12345@";
        char[] mang2 = s42.toCharArray();
        //duyet mang
        for (int i = 0; i < mang2.length; i++) {
            System.out.println(mang2[i]);
        }

        //7.20 reverse() Dao nguoc chuoi
        String s43 = "123456789abc";
        //khai bao doi tuong thuoc class StringBuilder
        StringBuilder sb = new StringBuilder(s43);
        sb.reverse();
        String s44 = sb.toString(); //chuyen sang chuoi
        System.out.println(s44);
    }
}
