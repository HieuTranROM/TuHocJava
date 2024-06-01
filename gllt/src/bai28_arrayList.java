import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class bai28_arrayList {
    public static void main(String[] args) {
        //1. Khai bao List
        ArrayList<Integer> lst = new ArrayList<>();
        //2. khai bao voi so luong pt ban dau
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        //3. khoi tao list voi cac pt ban dau
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        //xuat list
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);

        //2. add them pt
        ArrayList<Integer> lst4 = new ArrayList<>();
        //add pt
        lst4.add(7);
        lst4.add(8);
        lst4.add(11);
        System.out.println(lst4);
        //add (index,element) vao vi tri chi dinh
        lst4.add(1, 99);
        System.out.println("lst4 moi add 99 la: ");
        System.out.println(lst4);

        //2.2 size: tra ve so pt cua list
        System.out.println("so pt cua lst4 la: " + lst4.size());

        //2.3 get(int index): tra ve gia tri list tai vi tri index
        System.out.println(lst4.get(3));

        //2.4 remove (index)
        lst4.remove(2);
        System.out.println("lst4 sau xoa gia tri tai vi tri index 2 la: ");
        System.out.println(lst4);

        //2.5 remove (1 pt dc chi dinh)
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("lst5 =" + lst5);
        lst5.remove(Integer.valueOf(6));
        System.out.println("lst5 sau khi xoa =" + lst5);

        //2.6 set(index,element): thay doi thong tin
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println(lst6);
        lst6.set(0, 5);
        System.out.println("lst6 sau khi thay doi =" + lst6);

        //2.7 contains() ktr collection co chua pt nao do hay ko
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        boolean ktr = lst7.contains(10);
        System.out.println(ktr);

        //2.8 collection.sort(list): Sx tang dan
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(7, 2, 1, 4, 5, 6));
        Collections.sort(lst8);
        System.out.println("list8 sau sx la :" + lst8);

        //2.12 indexOf(): Tim vi tri dau tien cua element trong list
        //neu 0 ton tai tra ve -1
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(7, 2, 1, 4, 5, 6));
        System.out.println(lst9.indexOf(7));

        //3. Duyet List
        //3.1 cach 1
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(7, 2, 1, 4, 5, 6));
        System.out.println("lst10 dung duyet for");
        for (int vl : lst10) {
            System.out.println(vl);
        }

    }
}
