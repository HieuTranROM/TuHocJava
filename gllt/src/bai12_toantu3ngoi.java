import java.util.Scanner;

public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        //nhap vao ban phim 1 so,ktr chan le
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String traloi = (n%2==0)?"Chan" : "Le";
        System.out.println(traloi);
    }
}
