import java.util.Scanner;

public class bai25_charjava {
    public static void main(String[] args) {
        //khai bao
        char ch = 'a';//khoi tao
        char ch1 = 66;//khoi tao
        char ch2;//khai bao
        System.out.println(ch1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 ky tu: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println("Ky tu vua nhap: " + ch4);
    }
}
