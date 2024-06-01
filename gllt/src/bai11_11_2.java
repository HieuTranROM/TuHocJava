import java.util.Scanner;

public class bai11_11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap chieu cao: ");
        double height = sc.nextDouble();
        System.out.println("Moi ban nhap can nang: ");
        double weight = sc.nextDouble();
        double BMI = weight/(Math.pow(height, 2));
        if (BMI < 15){
            System.out.println("Than hinh qua gay");
        }else if (BMI >=15 && BMI < 16){
            System.out.println("Than hinh gay");
        }else if (BMI >=16 && BMI < 18.5){
            System.out.println("Than hinh hoi gay");
        }else if (BMI >=18.5 && BMI <25){
            System.out.println("THan hinh binh thuong");
        }else if (BMI >=25 && BMI < 30){
            System.out.println("Than hinh hoi beo");
        }else if (BMI >=30 && BMI<35){
            System.out.println("Than hinh beo");
        }else {
            System.out.println("Than hinh qua beo");
        }
    }
}
