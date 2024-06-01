public class bai17_breakcontinue {
    public static void main(String[] args) {
        //tinh tong tu 1 toi 5 nhung bo qua so 3
        int tong = 0;
        for (int i = 0; i <= 5; i++){
            if (i == 3){
                continue;
            }else{
                tong += i;
            }
        }
        System.out.println("tong = " + tong);
        //break
        int n = 0;
        while (n < 100){
            System.out.println("n = " + n);
            if(n == 15){
                break;
            }
            n++;
        }
    }
}
