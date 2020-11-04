import java.io.*;
import java.util.Scanner;

class HOCSINH{
    Scanner scanner = new Scanner(System.in);
    private String maSo;
    private String hoTen;
    private float dtb;

    public String getmaSo(){
        return maSo;
    }
    public void setmaSo(String ms){
        maSo = ms;
    }
    public String gethoTen(){
        return hoTen;
    }
    public void sethoTen(String ht){
        hoTen = ht;
    }
    public float getdtb(){
        return dtb;
    }
    public void setdtb(float diemTB){
        dtb = diemTB;
    }
    public void input(){
        System.out.print("Nhap ma so hoc sinh: ");
        maSo = scanner.nextLine();
        System.out.print("Nhap ho ten hoc sinh: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        dtb = scanner.nextFloat();
    }
    public void output(){
        System.out.println("Ma so: "+maSo);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Diem TB: " + dtb);
    }
    public void rank(){
        if (dtb < 5)
            System.out.println("Xep loai yeu");
        if (dtb>=5 && dtb <7)
            System.out.println("Xep loai trung binh");
        if (dtb >= 7 && dtb<9 )
            System.out.println("Xep loai kha");
        if (dtb >= 9)
            System.out.println("Xep loai gioi");
    }

}
public class bai1 {
    public static void main(String[] args) {
        HOCSINH hs = new HOCSINH();
        hs.input();
        hs.output();
        hs.rank();
        System.out.println("Ho ten cua hs vua nhap: " + hs.gethoTen());
        String htMoi = "Tran A";
        hs.sethoTen(htMoi);
        System.out.println("Ho ten cua hs sau khi sua: " + hs.gethoTen());
    }
    
}
