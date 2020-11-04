import java.io.*;
import java.util.Scanner;

class HCN{
    int chieuDai, chieuRong;
    Scanner x = new Scanner(System.in);
    public HCN(){
        chieuDai = 1;
        chieuRong = 1;
    }
    public HCN(int a, int b){
        this.chieuDai = a;
        this.chieuRong = b;
    }
    public HCN(HCN p){
        this.chieuDai = p.chieuDai;
        this.chieuRong = p.chieuRong;
    }
    public int getChieuDai(){
        return chieuDai;
    }
    public void setChieuDai(int a){
        this.chieuDai = a;
    }
    public int getChieuRong(){
        return chieuRong;
    }
    public void setChieuRong(int b){
        this.chieuRong = b;
    }
    public void tinhChuVi(){
        int CV = 0;
        CV = (chieuDai + chieuRong)*2;
        System.out.println("Chu vi HCN la: " + CV);
    }
    public void tinhDienTich(){
        int DT = chieuDai*chieuRong;
        System.out.println("Dien tich HCN la: " + DT);
    }
    public void inPut(){
        do{
            System.out.print("Nhap chieu dai: ");
            chieuDai = x.nextInt();
            System.out.print("Nhap chieu rong: ");
            chieuRong = x.nextInt();
        }
        while(chieuDai < chieuRong);
    }
}

public class bai1 {
    public static void main(String[] args) {
        HCN hcn1 = new HCN();
        int a = 4;
        int b = 6;
        HCN hcn2 = new HCN(a, b);
        HCN hcn3 = new HCN(hcn2);
        hcn1.tinhChuVi();
        hcn1.tinhDienTich();
        hcn2.tinhChuVi();
        hcn2.tinhDienTich();
        hcn3.tinhChuVi();
        hcn3.tinhDienTich();
    }
}
