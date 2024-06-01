public class bai17_17_5 {
    public static void main(String[] args) {
        int m = 1;
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            m *= i;
            sum += m;
        }
        System.out.println("Tong cua m la: " + sum);
    }
}
