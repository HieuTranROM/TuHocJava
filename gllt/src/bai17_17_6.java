public class bai17_17_6 {
    public static void main(String[] args) {
/*        BT Java 17:
        so hoan hao la so:
        tong cac uoc thuc cua no bang chinh no
        vi du:6 = 1 + 2 + 3 (6)
        Tim tat ca nhung so hoan thien trong pham vi tu 1 - 1000*/

/*        int n = 7;
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        if (tong == n) {
            System.out.println(n + " la so hoan hao");
        } else {
            System.out.println(n + " la so khong hoan hao");
        }*/

        //for
        for (int n = 1; n < 1000; n++) {
            int tong = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    tong += i;
                }
            }
            if (tong == n) {
                System.out.print(n + " ");

            }
        }
    }
}
