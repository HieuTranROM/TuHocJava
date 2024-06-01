public class bai20_xulyngoaile {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("c" + c);
        } catch (ArithmeticException ex) {
            System.out.println("Co loi toan hoc roi bu no oi...");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Co loi roi bu no oi....");
            ex.printStackTrace();
        } finally {
            System.out.println("Co loi hay khong loi deu lam cai nay");
        }
        System.out.println("Doan code phia sau");
    }
}
