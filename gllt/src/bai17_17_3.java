import java.util.Scanner;

public class bai17_17_3 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so nguyen n: ");
        n = sc.nextInt();
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) {
                if (i == 3) {
                    continue;
                    //break;
                } else {
                    sum += i;
                }
            }
            System.out.println("tong cac so le tu 1 cho den " + n + " la " + sum);
        }
    }
}