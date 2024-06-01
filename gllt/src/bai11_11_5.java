import java.util.Scanner;

public class bai11_11_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so a: ");
        double a = sc.nextDouble();
        System.out.println("Moi ban nhap vao so b: ");
        double b = sc.nextDouble();
        System.out.println("Moi ban nhap vao so c: ");
        double c = sc.nextDouble();
        //tinh delta
        double delta = Math.pow(b,2) - (4*a*c);
        //kiem tra dieu kien
        if (delta<0){
            System.out.println("Phuong trinh vo nghiem");
        }else if (delta == 0){
            double x = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep x1=x2= " +x);
        }
        else {
            double x1 = (-b+Math.sqrt(delta)) / (2*a);
            double x2 = (-b-Math.sqrt(delta)) / (2*a);
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            System.out.println("x1= " +x1);
            System.out.println("x2= " +x2);
        }
    }
}
