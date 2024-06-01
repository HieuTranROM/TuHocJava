import java.util.Arrays;
import java.util.Scanner;

public class bai27_baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so phan tu cua mang");
        int n = sc.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("M[" + i + "]= "); //M[0]
            M[i] = sc.nextInt();
        }
        System.out.println("Mang M duoc tao ra la: ");
        System.out.println(Arrays.toString(M));

        for (int i = 0, j = M.length - 1; i < j; i++, j--) {
            int temp = M[i];
            M[i] = M[j];
            M[j] = temp;
        }
        System.out.println("Mang sau khi dao nguoc la: ");
        System.out.println(Arrays.toString(M));

        Arrays.sort(M);
        System.out.println("Mang sau sx tang la: ");
        System.out.println(Arrays.toString(M));

        int tong = 0;
        for (int pt : M) {
            tong += pt;
        }
        System.out.println("Tong cac phan tu la: " + tong);

        System.out.println("moi nhap vao 1 so: ");

        int so = sc.nextInt();
        boolean ktr = false;
        String vitri = "";
        for (int i = 0; i < n; i++) {
            if (M[i] == so) {
                ktr = true;
                vitri += (i + " ");
            }
        }
        if (ktr)
            System.out.println(so + " ton tai trong mang voi vi tri index la: " + vitri);
        else
            System.out.println(so + " khong ton tai trong mang ");
    }
}
