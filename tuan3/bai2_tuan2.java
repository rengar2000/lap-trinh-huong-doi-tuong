import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class DSMang{
    private int soPt;
    private int arr[];
    Scanner x = new Scanner(System.in);
    public DSMang(){
        this.soPt = 0;
        this.arr = null;
    }
    public DSMang(int soPt, int arr[]){
        this.soPt = soPt;
        this.arr = arr;
    }
    public DSMang(DSMang arr){
        this.soPt = arr.soPt;
        this.arr = arr.arr;
    }
    public int getSoPt(){
        return soPt;
    }
    public void setSoPt(int so){
        soPt = so;
    }
    public void inPut(){
        arr = new int [soPt];
        for (int i = 0; i < soPt; i++){
            arr[i] = (int) (Math.random()*100);
        }
    }
    public void outPut(){
        System.out.println("Mang"+ Arrays.toString(arr));
    }
    public void ollNumber(){
        float TB = 0;
        int dem = 0, tong = 0;
        for (int i = 0; i< soPt; i++){
            if(arr[i]%2 != 0){
                tong += arr[i];
                dem += 1;
            }
        }
        TB = tong/dem;
        System.out.println("Gia tri trung binh cua cac so le: "+ TB);
    }
    public void timMax(){
        int max = arr[0];
        for (int i=0; i<soPt; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Phan tu lon nhat la: "+ max);
    }
    public void xapSep(){
        Arrays.sort(arr);
    }
}

public class bai2_tuan2 {
    public static void main(String[] args) {
        DSMang list1 = new DSMang();
        list1.setSoPt((int) (Math.random()*100));
        System.out.println("LIST1");
        list1.inPut();
        list1.outPut();
        list1.ollNumber();
        list1.xapSep();
        list1.outPut();
        int []arr = {90,2,5,7,13,22,56};
        int i = arr.length;
        DSMang list2 = new DSMang(i, arr);
        System.out.println("LIST2");
        list2.outPut();
        list2.ollNumber();
        list2.xapSep();
        list2.outPut();
        DSMang list3 = new DSMang(list2);
        System.out.println("LIST3");
        list3.outPut();
        list3.ollNumber();
        list3.xapSep();
        list3.outPut();
    }
}
