import java.io.*;
import java.util.*;

class danhSachHS{
    private HOCSINH ds[];
    private int sl;
    Scanner x = new Scanner(System.in);
    public void nhapDS(){
        System.out.print("Nhap so luong sinh vien");
        sl = x.nextInt();
        ds = new HOCSINH[sl];
        int tamp = 0;
        String htMoi = "Tran Van B";
        String msMoi = "222";
        float dtbMoi = 8;
        for (int i=0; i < sl; i++){
            if(tamp ==0 ){
                ds[i] = new HOCSINH();
                ds[i].inPut();
                tamp = 1;
            }
            else if (tamp == 1){
                ds[i]= new HOCSINH(msMoi, htMoi, dtbMoi);
                tamp = 2;
            }
            else if (tamp == 2){
                ds[i] = new HOCSINH(ds[i-1]);
                tamp = 0;
            }
        }
    }
    public void xuatDS(){
        for (int i = 0; i<sl; i++){
        ds[i].outPut();
    }
    }
    public void sapXep(){
        float dem = 0;
        for (int i = 0; i < sl; i++){
            for (int j = i+1; j<sl; j++){
                if (ds[i].diemTB < ds[j].diemTB){
                    dem = ds[j].diemTB;
                    ds[i].diemTB = ds[j].diemTB;
                    ds[j].diemTB = dem;
                }
            }
        }
    }
}

public class bai3_tuan2 {
    public static void main(String[] args) {
        danhSachHS list1 = new danhSachHS();
        list1.nhapDS();
        list1.xuatDS();
        list1.sapXep();
        list1.xuatDS();
    }
}
