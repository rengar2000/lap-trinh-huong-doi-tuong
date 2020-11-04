import java.io.*;
import java.util.Scanner;

class DSHCN{
    int sl = 0;
    HCN ds[];
    Scanner x = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap so luong HCN: ");
        sl = x.nextInt();
        ds = new HCN[sl];
        for(int i = 0; i<sl; i++){
            System.out.println("Hinh chu nhat thu: " + (i+1));
            ds[i] = new HCN();
            ds[i].inPut();
        }
    }
    public void xuat(){
        System.out.println("IN DANH SACH HINH CHU NHAT");
        for(int i = 0; i < sl; i++){
            System.out.println("hinh chu nhat thu " + (i+1));
            System.out.println("chieu dai: " + ds[i].chieuDai);
            System.out.println("chieu rong: " + ds[i].chieuRong);
            ds[i].tinhDienTich();
            ds[i].tinhChuVi();
        }
    }
}

public class bai2 {
    public static void main(String[] args) {
        DSHCN list = new DSHCN();
        list.nhap();
        list.xuat();
    }
}
