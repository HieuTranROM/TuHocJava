import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class bai29_bt33 {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("user1", "123456");
        users.put("user2", "1235456");
        users.put("user3", "1223456");
        users.put("user4", "1234556");
        users.put("user5", "1234656");
        users.put("user6", "1234156");
        users.put("user7", "1231456");
        users.put("user8", "1232456");
        users.put("user9", "1234556");
        users.put("user10", "1234566");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap user name: ");
        String userName = sc.nextLine();
        System.out.println("Nhap password: ");
        String pass = sc.nextLine();

        //ktr
        if (!users.containsKey(userName)) {
            //neu ko co key trong hashmap users thi dong nghia la users ko ton tai
            System.out.println("User ko ton tai");
        } else if (!users.get(userName).equals(pass)) {
            //sai mk
            System.out.println("Pass sai");
        } else {
            System.out.println("Ban da dang nhap thanh cong");
        }
    }
}
