import java.io.*;
import java.util.Scanner;

class phanSo{
    int tu;
    int mau;
    Scanner x = new Scanner(System.in);
    public phanSo(){
        this.tu = 0;
        this.mau = 1;
    }
    public phanSo(int a, int b){
        this.tu = a;
        this.mau = b;
    }
    public phanSo(phanSo p){
        this.tu = p.tu;
        this.mau = p.mau;
    }
    public int getTuSo(){
        return tu;
    }
    public void setTuSo(int a){
        tu = a;
    }
    public int getMauSo(){
        return mau;
    }
    public void setMauSo(int b){
        mau = b;
    }
    public void nhapPS(){
        System.out.print("Nhap tu so: ");
        tu = x.nextInt();
        System.out.print("Nhap mau so: ");
        mau = x.nextInt();
    }
    public void xuatPS(){
        System.out.print(tu + "/" + mau);
    }
    public int timUCLN(int a, int b) {
        int UCLN = 0;
        if(a == 0 || b == 0){
            UCLN = a+b;
        }
        while(a!=b){
            if(a<b){
                b = b-a;
            }
            else{
                a = a-b;
            }
            UCLN = a;
        }
        return UCLN;
    }
    public void rutGonPS(){
        int i = timUCLN(this.tu, this.mau);
        this.setTuSo(this.getTuSo()/i);
        this.setMauSo(this.getMauSo()/i);
    }
    public phanSo cong(phanSo p){
        int tuMoi, mauMoi;
        mauMoi = this.mau*p.mau;
        tuMoi = this.tu*p.mau + p.tu*this.mau;
        phanSo ps = new phanSo(tuMoi, mauMoi);
        ps.rutGonPS();
        return ps;
    }
    public phanSo tru(phanSo p){
        int tuMoi, mauMoi;
        mauMoi = this.mau*p.mau;
        tuMoi = this.tu*p.mau - p.tu*this.mau;
        phanSo ps = new phanSo(tuMoi, mauMoi);
        ps.rutGonPS();
        return ps;
    }
    public phanSo nhan(phanSo p){
        int tuMoi, mauMoi;
        mauMoi = this.mau*p.mau;
        tuMoi = this.tu*p.tu;
        phanSo ps = new phanSo(tuMoi, mauMoi);
        ps.rutGonPS();
        return ps;
    }
    public phanSo chia(phanSo p){
        int tuMoi, mauMoi;
        mauMoi = this.mau*p.tu;
        tuMoi = this.tu*p.mau;
        phanSo ps = new phanSo(tuMoi, mauMoi);
        ps.rutGonPS();
        return ps;
    }
    public void show(){
        System.out.println(this.tu+"/"+this.mau);
    }
}

public class bai2 {
    public static void main(String[] args) {
        phanSo ps1 = new phanSo();
        phanSo ps2 = new phanSo(4, 16);
        int t = 3, m = 4;
        phanSo ps3 = new phanSo(t,m);
        ps1.cong(ps3).show();
        phanSo ps4 = new phanSo(ps1.cong(ps3));
        ps4.nhan(ps2).show();
    }
}

