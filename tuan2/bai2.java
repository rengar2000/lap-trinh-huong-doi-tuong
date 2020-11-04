import java.util.*;
class Mang{
    private int soPt;
    private int array[];

    public int getsoPt(){
        return soPt;
    }
    public void setsoPt(int so){
        soPt = so;
    }
    public void input(){
        array = new int [soPt];
        for (int i = 0; i < soPt; i++)
            array[i] = (int) (Math.random()*100);
    }
    public void output(){
        System.out.println("Mang: " +Arrays.toString(array));
    }
    public void trungBinhSoLe(){
        int tong = 0;
        int dem = 0;
        for (int i=0; i < soPt; i++)
        {
            if (array[i]%2!=0){
                tong += array[i];
                dem +=1;
            }
        }
        int TB = tong/dem;
        System.out.println("Trung binh cua cac so le: "+ TB);
    }
    public void timMax(){
        int max;
        max = array[0];
        for (int i=0; i<soPt;i++)
        {
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("so lon nhat la: "+max);
    }
    public void sapXep(){
       Arrays.sort(array); 
    }
}
public class bai2 {
    public static void main(String[] args) {
        Mang mang = new Mang();
        mang.setsoPt((int) (Math.random()*100));
        mang.input();
        mang.output();
        mang.trungBinhSoLe();
        mang.timMax();
        mang.sapXep();
        System.out.println("Mang sau khi sap xep: ");
        mang.output();

    }
}
