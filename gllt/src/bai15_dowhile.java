public class bai15_dowhile {
    public static void main(String[] args) {
        //tinh tong cac so 1-5
        int a = 1;
        int tong = 0;
        do {
            tong += a;
            a++;
        }while (a<=5);
        System.out.println("tong= " + tong);
    }
}
