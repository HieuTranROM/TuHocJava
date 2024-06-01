import java.util.HashMap;

public class bai29_hashmap {
    public static void main(String[] args) {
        //1. khai bao
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        //2. them cac phan tu vao hashmap
        map.put(1, "apple");
        map.put(2, "cherry");
        map.put(3, "banana");
        System.out.println(map);

        //3. lay gia tri cua mot phan tu
        String value = map.get(1);
        System.out.println(value);

        //4. xoa phan tu khoi hash map
        map.remove(2);
        System.out.println(map.get(2));

        //5. kiem tra xem mot phan tu co ton tai trong map hay khong
        boolean check = map.containsKey(3);
        System.out.println(check);

        //6. kiem tra xem mot gia tri co ton tai trong map hay ko
        boolean checkVL = map.containsValue("banana");
        System.out.println(checkVL);

        //7. kiem tra xem hash map co rong hay ko
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);

        //8. lay so luong pt trong hashmap
        int soLuongPt = map.size();
        System.out.println(soLuongPt);

        //9. duyet hashmap
        for (Integer key : map.keySet()) {
            String vl = map.get(key);
            System.out.println(key + " : " + vl);
        }


    }
}
