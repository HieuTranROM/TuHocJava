import java.util.Scanner;

public class    bai10_scanner {
    public static void main(String[] args) {
        //Khoi tao 1 doi tuong scanner
/*        Scanner sc = new Scanner(System.in);

        //cho phep nhap chuoi
        System.out.println("Moi nhap vao mk cap 1: ");
        String mk1 = sc.nextLine();
        System.out.println("mk cap 1 la :" +mk1);
        //nhap so nguyen
        System.out.println("Moi nhap vao 1 so nguyen a:");
        int a = sc.nextInt();
        System.out.println("a=" +a);
        //nhap so float
        System.out.println("moi nhap vao 1 so thuc x:");
        float x = sc.nextFloat();
        System.out.println("x=" +x);*/

        //nhap chuoi
/*        System.out.println("Moi cu nhap ten");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("ten cu la: " +ten);*/

   /*     Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao ban kinh r: ");
        double r = sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r,2);

        System.out.println("Chu vi=" + cv);
        System.out.println("Dien tich=" + dt);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so a: ");
        double a = sc.nextDouble();
        System.out.println("Moi nhap vao so b: ");
        double b = sc.nextDouble();
        System.out.println("Dien tich hinh chu nhat la s=: " + a * b);
        System.out.println("Chu vi hinh chu nhat la v=: " + (a+b)/2);
    }
}
