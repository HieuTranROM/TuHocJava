import java.util.Scanner;

public class bai14_demowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so nguyen tu 1-99: ");
        int n = sc.nextInt(); //khai bao n
        while (n<1 || n>99){
            System.out.println("Nhap lai n, n chi duoc phep tu 1-99");
            n = sc.nextInt(); //update lai bien n, yeu cau nguoi dung nhap lai
        }
        System.out.println("Ban da nhap xong n= " +n);
    }
}
