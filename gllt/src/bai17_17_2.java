import java.util.Scanner;

public class bai17_17_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so a: ");
        int a = sc.nextInt();
        int sum = 0;
        if (a % 2 == 0) {
            for (int i = 0; i < a; i += 2) {
                sum += i;
            }
            System.out.println("tong cac so chan tu 0 den " + a + " = " + sum);
        } else {
            System.out.println("toi khong tinh tong so le, by by");
        }

    }
}

