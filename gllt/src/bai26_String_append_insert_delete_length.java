public class bai26_String_append_insert_delete_length {
    public static void main(String[] args) {
        //lop chinh lam viec la String Builder
        String s = "Hoi do toi che mom em rong" +
                "\nkhong tin hai dua chap mom no";
        System.out.println(s);
        //khai bao doi tuong st
        StringBuilder chuoi = new StringBuilder();
        //7. cac phuong thuc thuong dung
        //7.1 append :Them vao cuoi chuoi
        chuoi.append("Xin chao, ");
        chuoi.append("minh moi hoc lap trinh");
        chuoi.append(", rat vui duoc lam quen cac ban");
        System.out.println(chuoi);
        chuoi.insert(2, "obama");
        System.out.println(chuoi);
        //7.3 delete(start, end);
        //xoa tat ca cac ky tu tu vi tri start den vi tri length-1
        chuoi.delete(2, 7);
        System.out.println(chuoi);
        //7.4 chuoi.length: tra ve do dai cua chuoi tinh ca space
        System.out.println(chuoi.length());
    }
}
