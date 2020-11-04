import java.io.*;
import java.util.*;

class HOCSINH{
    String maso, hoTen;
    float diemTB;
    Scanner x = new Scanner(System.in);
    public HOCSINH(){
        this.maso = "";
        this.hoTen = "";
        this.diemTB = 0;
    }
    public HOCSINH(String maso, String hoTen, float diemTB){
        this.maso = maso;
        this.hoTen = hoTen;
        this.diemTB = diemTB; 
    }
    public HOCSINH(HOCSINH hs){
        this.maso = hs.maso;
        this.hoTen = hs.hoTen;
        this.diemTB = hs.diemTB;
    }

    public String getMaSo() {
        return maso;
    }
    public void setMaSo(String maso){
        this.maso = maso;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public float getDiemTB(){
        return diemTB;
    }
    public void setDiemTB(float diemTB){
        this.diemTB = diemTB;
    }
    public void inPut(){
        System.out.print("Nhap ho ten SV: ");
        hoTen = x.nextLine();
        System.out.print("Nhap ma so SV: ");
        maso = x.nextLine();
        System.out.print("Nhap diem TB: ");
        diemTB = x.nextFloat();
    }
    public void outPut(){
        System.out.println("Ma so sinh vien: " + maso);
        System.out.println("Ho ten sinh vien: " + hoTen);
        System.out.println("Diem trung binh: " + diemTB);
    }
    public void rank(){
        if (diemTB < 5){
            System.out.println("Xep loai yeu");
        }
        if(diemTB >=5 && diemTB < 7){
            System.out.println("Xep loai trung binh");
        }
        if(diemTB >= 7 && diemTB < 9){
            System.out.println("Xep loai kha");
        }
        if(diemTB >= 9){
            System.out.println("Xep loai gioi");
        }
    }
}
public class bai1_tuan2 {
    public static void main(String[] args) {
        HOCSINH hs = new HOCSINH();
        hs.inPut();
        hs.outPut();
        hs.rank();
        String htMoi = "Tran Van B";
        String msMoi = "222";
        float diemMoi = 9;
        HOCSINH hs1 = new HOCSINH(htMoi, msMoi, diemMoi);
        hs1.outPut();
        hs1.rank();
        HOCSINH hs2 = new HOCSINH(hs);
        hs2.outPut();
        hs2.rank();
    }
}