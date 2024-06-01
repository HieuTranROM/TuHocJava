import java.util.Scanner;

public class bai11_11_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thang de kiem tra:");
        int month = sc.nextInt();
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("Thang " + month + " co 31 ngay");
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("Thang " + month + " co 30 ngay");
        } else if (month == 2){
            System.out.println("Vi thang ban nhap la thang 2 nen can nhap nam de kiem tra:");
            int year = sc.nextInt();
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                System.out.println("Nam " + year + " la nam nhuon");
            }else{
                System.out.println("Nam " + year + " khong phai la nam nhuon");
            }
        }else {
            System.out.println("Thang ban nhap sai yeu cau nhap lai");
        }
    }
        }
