package oopSXClass;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        //tao list
        ArrayList<SanPham> ds = new ArrayList<>();
        //khoi tao doi tuong san pham
        SanPham sp1 = new SanPham(1,"SamSung",1050);
        SanPham sp2 = new SanPham(2,"Iphone",500);
        SanPham sp3 = new SanPham(3,"DaoCamHo",400);
        //add san pham vao list
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);
        //xem danh sach sp trong list
        for (SanPham sp : ds) {
            System.out.println(sp);
        }

        //goi pt sap xep
        Collections.sort(ds);
        System.out.println("Danh sach sau xap xep la: ");
        for (SanPham sp : ds) {
            System.out.println(sp);
        }
    }
}
