import java.util.*;
class danhSachHS{
    private HOCSINH ds[];
    private int sl;

    Scanner x = new Scanner(System.in);
    public void nhapds(){
        System.out.print("Nhap so luong hoc sinh: ");
        sl = x.nextInt();
        ds = new HOCSINH[sl];
        for (int i = 0; i<sl; i++)
        {
            ds[i] = new HOCSINH();
            ds[i].input();
        }
    }
    public void xuatds(){
        System.out.println("Danh sach hoc sinh la: \n");
        for (int i=0; i < sl; i++)
            ds[i].output();
    }
    public void sapxep(){
        HOCSINH tamp = new HOCSINH();
        for (int i = 0; i<sl; i++){
            for (int j = i+1; j<sl; j++){
                if(ds[i].getdtb() < ds[j].getdtb()){
                    tamp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = tamp;
                }
            }
        }
    }
}

public class bai3 {
    public static void main(String[] args) {
        danhSachHS list = new danhSachHS();
        list.nhapds();
        list.xuatds();
        list.sapxep();
        list.xuatds();
    }
    
}
