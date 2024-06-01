public class bai26_baitap19 {
    public static void main(String[] args) {
        //tinh tong cac so trong chuoi tren
        //tinh trung binh cuong
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0; //bien tinh tong
        int count = 0; //bien luu so luong so
        //tach chuoi thanh cac phan bang cach su dung phuong thuc split() cua lop String
        String[] parts = str1.split(" ");
        //duyet qua tung phan va chuyen no sang kieu so neu co the
        for (String pt : parts) {
            System.out.println(pt);
            try {
                //Chuyen chuoi sang so nguyen bang phuong thuc parseInt() cua lop Interger
                int num = Integer.parseInt(pt);
                sum += num;//cong them so vao tong
                count++;
            } catch (NumberFormatException e) {
                //Chi don gian la khong lam gi ca
            }
        }
        //tinh trung binh cong
        double tbc = (double) sum / count;
        System.out.println("Tong cac so trong chuoi la: " + sum);
        System.out.println("Trung binh cong cac so trong chuoi la: " + tbc);
    }
}
