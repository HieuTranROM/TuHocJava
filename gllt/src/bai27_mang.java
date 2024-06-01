import java.util.Arrays;

public class bai27_mang {
    public static void main(String[] args) {
        //1.khai bao mang
        String[] mangStr;
        Float[] mangFloat;
        Double[] mangDouble;

        //2.khai bao mang kem kich thuoc
        String[] mangStr2 = new String[12];//chua toi da 12 pt
        int[] mangNguyen2 = new int[7];

        //3.khoi tao mang kem gia tri ban dau
        String[] mangStr3 = new String[]{"chi pheo", "thi no", "ong giao"};
        int[] mangnguyen3 = new int[]{1, 2, 3, 4, 5, 6, 7};

        //truy xuat phan tu cua mang dua theo index
        System.out.println(mangnguyen3[2]);
        System.out.println(mangStr3[2]);
        //test
        System.out.println(mangStr2[0]);
        System.out.println(mangStr2[1]);
        //test 2
        mangStr = new String[]{"hello", "byy"};
        System.out.println(mangStr[0]);

        //length
        System.out.println(mangnguyen3.length);

        //6. Duyet mang dung for
        //c1
        int[] mang4 = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int pt : mang4) {
            System.out.println(pt);
        }

        String[] mang5 = new String[]{"chi pheo", "thi no", "ong giao"};
        for (String pt : mang5) {
            System.out.print(pt + "\t");
        }
        System.out.println("-------");
        //c2
        for (int i = 0; i < mang4.length; i++) {
            System.out.println(mang4[i]);
        }

        String[] mang6 = new String[]{"chi pheo", "thi no", "ong giao"};
        for (int i = 0; i < mang6.length; i++) {
            System.out.println(mang6[i]);
        }
        mang6[0] = "obama";
        //duyet mang
        System.out.println("mang sau khi thay doi: ");
        for (int i = 0; i < mang6.length; i++) {
            System.out.println(mang6[i]);
        }

        //update toan bo danh sach
        int[] mang7 = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < mang7.length; i++) {
            mang7[i] += 5;
        }

        //duyet mang 7
        System.out.println("Mang sau khi thay doi: ");
        for (int i = 0; i < mang7.length; i++) {
            System.out.println(mang7[i]);
        }

        //sx tang dan
        int[] mang8 = {8, 9, 12, 48, 1, 2, 3};
        Arrays.sort(mang8);
        System.out.println("Mang sau sx tang la: ");
        System.out.println(Arrays.toString(mang8));

        //10. dao nguoc mang
        int[] mang9 = {8, 9, 12, 48, 1, 2, 3};
        for (int i = 0, j = mang9.length - 1; i < j; i++, j--) {
            int temp = mang9[i];
            mang9[i] = mang9[j];
            mang9[j] = temp;
        }

        System.out.println("Mang sau khi dao nguoc la: ");
        System.out.println(Arrays.toString(mang9));

        //11. gan mang truy xuat cung vung nho
        int[] mang10 = {8, 9, 12, 48, 1, 2, 3};
        int[] mang11 = mang10;
        mang10[0] = 100;
        System.out.println(Arrays.toString(mang10));
        System.out.println(Arrays.toString(mang11));

        //12. clone
        int[] mang12 = {8, 9, 12, 48, 1, 2, 3};
        int[] mang13 = mang12.clone();
        mang12[0] = 99;
        System.out.println(Arrays.toString(mang12));
        System.out.println(Arrays.toString(mang13));
    }


}
