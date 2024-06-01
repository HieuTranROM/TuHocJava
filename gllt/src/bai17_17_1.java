import java.util.Scanner;

public class bai17_17_1 {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao so nguyen n: ");
        int n = sc.nextInt();
        int gt = 1;
        for (int i = 1; i <= n; i++){
            gt = gt * i;
            System.out.println(gt);
        }*/

        //while
        int n;
        int i = 1;
        int gt = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so nguyen n: ");
        n = sc.nextInt();
        //tinh giai thua
        while(i<=n){
            gt *= i;
            i++;
        }
        System.out.println(n+ "!=" + gt);
    }
}
