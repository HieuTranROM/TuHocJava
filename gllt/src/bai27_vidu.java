import java.util.Arrays;
import java.util.Scanner;

public class bai27_vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so phan tu toi da cua mang: ");
        int n = sc.nextInt();
        //tao mang co n phan tu (cap phat bo nho cho mang)
        int[] M = new int[n];
        //nhap du lieu cho tung phan tu
        System.out.println("so pt cua mang " + M.length);
        for (int i = 0; i < n; i++) {
            System.out.println("M[" + i + "]= "); //M[0]
            M[i] = sc.nextInt();
        }

        //xuat mang de xem
        System.out.println("Mang M duoc tao ra la: ");
        System.out.println(Arrays.toString(M));
    }
    
}
