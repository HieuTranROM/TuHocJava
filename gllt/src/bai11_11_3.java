import java.util.Scanner;

public class bai11_11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap nam de kiem tra: ");
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Nam" + year + "la nam nhuon");
        }else{
            System.out.println("Nam" + year + "khong phai la nam nhuon");
        }
    }
}
