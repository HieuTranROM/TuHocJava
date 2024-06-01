import java.util.Scanner;

public class bai17_17_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so vao de kiem tra: ");
        int n = sc.nextInt();
        while (n % 2 != 0) {
            System.out.println("So " + n + " khong chia het cho 2, yeu cau nhap lai!");
            System.out.println("Moi ban nhap so vao de kiem tra: ");
            n = sc.nextInt();
            continue;
        }
        System.out.println("So " + n + " chia het cho 2");
    }
}

