import java.util.Arrays;
import java.util.Scanner;

public class baiSoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so pt cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Arr[" + i + "]= ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mang Arr duoc tao ra la: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("");
        System.out.println("Moi nhap vao so X bat ky de tim vi tri: ");
        int X = Integer.parseInt(sc.nextLine());
        boolean ktr = false;
        String vitri = "";
        for (int i = 0; i < n; i++) {
            if (arr[i] == X) {
                ktr = true;
                vitri += (i + " ");
            }
        }
        if (ktr)
            System.out.println(X + " ton tai trong mang voi vi tri index la: " + vitri);
        else
            System.out.println(X + " khong ton tai trong mang ");
    }
}


