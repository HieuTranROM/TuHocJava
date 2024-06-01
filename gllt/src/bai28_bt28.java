import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class bai28_bt28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so phan tu cua list: ");
        int n = Integer.parseInt(sc.nextLine());
        //tao 1 doi tuong random de tao cac so ngau nhien
        Random rd = new Random();
        ArrayList<Integer> lst = new ArrayList<>();
        //tao cac pt ngau nhien va them vao danh sach
        for (int i = 0; i < n; i++) {
            int ngauNhien = rd.nextInt(1, 100);
            lst.add(ngauNhien);
        }
        System.out.println(lst);
    }
}
