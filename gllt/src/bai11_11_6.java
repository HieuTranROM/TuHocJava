import java.util.Scanner;

public class bai11_11_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thang de kiem tra: ");
        int month = sc.nextInt();
        if (month == 1 || month == 2 || month == 3){
            System.out.println("Thang " + month + " thuoc quy 1");
        }else if (month == 4 || month == 5 || month == 6){
            System.out.println("Thang " + month + " thuoc quy 2");
        }else if (month == 7 || month == 8 || month == 9){
            System.out.println("Thang " + month + " thuoc quy 3");
        }else if (month == 10 || month == 11 || month == 12){
            System.out.println("Thang " + month + " thuoc quy 4");
        }else {
            System.out.println("Ban nhap sau moi ban nhap lai ");
        }
    }
}
