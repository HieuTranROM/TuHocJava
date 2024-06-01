import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_thuviendatetime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang + 1);
        System.out.println(ngay);

        //set ngay thang nam theo y muon
        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.YEAR, 1987);
        cal.set(Calendar.DAY_OF_MONTH, 27);
        //kiem tra ngay thang sau thiet lap
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        int thangSinh = cal.get(Calendar.MONTH);
        int namSinh = cal.get(Calendar.YEAR);
        //xuat
        System.out.println("Ngay thang nam sinh: " + ngaySinh + "/" + (thangSinh + 1) + "/" + namSinh);
        //xuat theo dinh dang
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        //tao 1 doi tuong de get time trong doi tuong cal
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);
    }
}
