import java.io.*;
import java.util.*;

class nhanVien{
    String maSo, hoTen;
    static float lcb = 3000000;
    static int slnv = 0;
    float hsl;
    Scanner x = new Scanner(System.in);
    public nhanVien(){
        maSo = "222";
        hoTen = "Nguyen Van B";
        hsl = 1;
        slnv += 1;
    }
    public nhanVien(String a, String b, float c){
        this.maSo = a;
        this.hoTen = b;
        this.hsl = c;
        slnv += 1;
    }
    public nhanVien(nhanVien m){
        this.maSo = m.maSo;
        this.hoTen = m.hoTen;
        this.hsl = m.hsl;
        slnv += 1;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String a){
        this.hoTen = a;
    }
    public String getMaSo(){
        return maSo;
    }
    public void setMaSo(String b){
        this.hoTen = b;
    }
    public float getHSL(){
        return hsl;
    }
    public void setHSL(float c){
        this.hsl = c;
    }
    public void inPut(){
        System.out.print("Nhap ho ten: ");
        hoTen = x.nextLine();
        System.out.print("Nhap ma so: ");
        maSo = x.nextLine();
        System.out.print("nhap he so luong: ");
        hsl = x.nextFloat();
    }
    public String toString(){
        return ("MSNV: " + maSo + " - Ho ten: "+hoTen+" - He so luong: "+hsl);
    }
    public long tinhLuong(){
        long luong;
        luong = (long) (hsl * lcb);
        return luong;
    }
    public void show(){
        System.out.println("luong nhan vien: " + tinhLuong());
    }
    static void inSLNV(){
        System.out.println("So luong nhan vien: " + slnv);
    }
    public void outPut(){
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Ma so: " + maSo);
        System.out.println("He so luong: " + hsl);
        System.out.println("luong nhan vien: " + tinhLuong());
    }
}


public class bai4 {
    public static void main(String[] args) {
        int n;
        Scanner x = new Scanner(System.in);
        System.out.print("nhap so luong nhan vien: ");
        n = x.nextInt();
        nhanVien[] ds = new nhanVien[n];
        for (int i = 0; i<n; i++){
            System.out.println("nhan vien thu " + (i+1));
            ds[i] = new nhanVien();
            ds[i].inPut();
        }
        for (int i = 0; i<n; i++){
            System.out.println("nhan vien thu " + (i+1));
            ds[i].outPut();
        }
        nhanVien.inSLNV();
        float max;
        nhanVien nv = new nhanVien();
        nhanVien nvt = new nhanVien(nv);
        for (int i = 0; i<n; i++){
            max = ds[0].getHSL();
            if(max < ds[i].getHSL()){
                max = ds[i].getHSL();
                nvt = ds[i];
            }
        }
    }
}
