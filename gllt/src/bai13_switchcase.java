import java.util.Scanner;

public class bai13_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 so nguyen: ");
        int a = sc.nextInt();
        // kiem tra so du cua a cho 2
        int div = a%2;
        switch (div){
            case 0:
                System.out.println(a + " la so chan");
                break;
            default:
                System.out.println(a + " la so le");
                break;
        }
    }
}
