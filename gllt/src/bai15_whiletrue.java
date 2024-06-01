public class bai15_whiletrue {
    public static void main(String[] args) {
        //vong whiletrue luon chay voi dieu kien dung va chay vinh cuu neu ko dung break
        int n = 0;
        while (true){
            n++;
            System.out.println("n= " + n);
            if (n == 9) {
                break;
            }
        }
    }
}
