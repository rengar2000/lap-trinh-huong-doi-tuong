import java.io.*;
import java.util.Scanner;

class nhanVien{
    String maSo, hoTen;
    static int slnv;
    static float lcb = 3000000;
    float hsl;
    Scanner x = new Scanner(System.in);
    public nhanVien(){
        String maSo = "000";
        String hoTen = "Van A";
        float hsl = 3;
        slnv++;
    }
    public nhanVien(String a, String b, float c){
        this.maSo = a;
        this.hoTen = b;
        this.hsl = c;
        slnv++;
    }
    public nhanVien(nhanVien d){
        this.maSo = d.maSo;
        this.hoTen = d.hoTen;
        this.hsl = d.hsl;
        slnv++;
    }
    public String getMaSo(){
        return maSo;
    }
    public String getHoTen(){
        return hoTen;
    }
    public float getHSL(){
        return hsl;
    }
    public void setMaSo(String a){
        this.maSo = a;
    }
    public void setHoTen(String b){
        this.hoTen = b;
    }
    public void setHSL(float c){
        this.hsl = c;
    }
    public String toString(){
        return ("Ma so: " + maSo + ", Ho ten: " + hoTen + ", He so luong: "+ hsl);
    }
    public void inPut(){
        System.out.print("Nhap ma so: ");
        maSo = x.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = x.nextLine();
        System.out.print("nhap he so luong: ");
        hsl = x.nextFloat();
    }
    public long luong(){
        long Luong;
        Luong = (int) (hsl*lcb);
        return Luong;
    }
    static void inSLNV(){
        System.out.print("So luong nhan vien: " + slnv);
    }
}

class DSNV{
    Scanner x = new Scanner(System.in);
    int sl;
    nhanVien ds[];
    public void nhapDS(){
        System.out.print("Nhap so luong nhan vien: ");
        sl = x.nextInt();
        ds = new nhanVien[sl];
        for(int i = 0; i<sl; i++){
            System.out.println("Nhan vien thu " + (i+1));
            ds[i] = new nhanVien();
            ds[i].inPut();
        }
    }
    public void xuatDS(){
        System.out.println("XUAT DANH SACH NHAN VIEN");
        for(int i = 0; i < sl; i++){
            System.out.println("Nhan vien thu " + (i+1));
            System.out.println("Ma so: " + ds[i].maSo);
            System.out.println("Ho ten: " + ds[i].hoTen);
            System.out.println("He so long: " + ds[i].hsl);
            System.out.println("Luong nhan vien: " + ds[i].luong());
        }
    }
}

public class bai3 {
    public static void main(String[] args) {
        nhanVien nv1 = new nhanVien();
        String ms = "111";
        String name = "Van B";
        float hs = 4;
        nhanVien nv2 = new nhanVien(ms, name, hs);
        nhanVien nv3 = new nhanVien(nv2);
        nv1.inPut();
        System.out.println(nv1.toString());
        System.out.println(nv2.toString());
        System.out.println(nv3.toString());
        nhanVien.inSLNV();
        float max = nv1.hsl;
        nhanVien nv = new nhanVien(nv1);
        if(max < nv2.getHSL()){
            max = nv2.getHSL();
            nv = nv2;
        }
        else if(max < nv3.getHSL()){
            max = nv3.getHSL();
            nv = nv3;
        }
        System.out.println("He so luong cao nhat: " + max);
        System.out.println("Nhan vien co he so luong cao nhat: " + nv.toString());
    }
}
