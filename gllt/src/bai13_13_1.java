import java.util.Scanner;

public class bai13_13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi bam so de chon: \n " +
                "1. tim theo ten \n"+
                "2. tim theo tac gia \n "+
                "3. tim theo nha xuat ban \n"+
                "4. tim theo tieu de");
        int chon = sc.nextInt();
        switch (chon){
            case 1:
                System.out.println("1. tim theo ten");
                break;
            case 2:
                System.out.println("2. tim theo tac gia");
                break;
            case 3:
                System.out.println("3. tim theo nha xuat ban");
                break;
            case 4:
                System.out.println("4. tim theo tieu de");
                break;
            default:
                System.out.println("phim bam khong hop le");
                break;
        }
    }

}
