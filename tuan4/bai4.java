import java.io.*;
import java.util.Scanner;
import java.math.*;

class tamGiac{
    int canh1, canh2, canh3;
    double h, p;
    Scanner x = new Scanner(System.in);
    public tamGiac(){
        canh1 = 1;
        canh2 = 1;
        canh3 = 1;
    }
    public int getCanh1(){
        return canh1;
    }
    public int getCanh2(){
        return canh2;
    }
    public int getCanh3(){
        return canh3;
    }
    public void setCanh1(int a){
        this.canh1 = a;
    }
    public void setCanh2(int b){
        this.canh2 = b;
    }
    public void setCanh3(int c){
        this.canh3 = c;
    }
    public void inPut(){
        do{
            System.out.print("nhap canh thu nhat: ");
            canh1 = x.nextInt();
            System.out.print("nhap canh thu hai: ");
            canh2 = x.nextInt();
            System.out.print("nhap canh thu ba: ");
            canh3 = x.nextInt();
        }
        while( (canh1 + canh2) < canh3);
        p = (double) (this.canh1 + this.canh2 + this.canh3) / 2;
        h = (float) (2*(Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3))/canh1));
    }
    public void xetLoaiTG(){
        if(canh1 == canh2 && canh2 == canh3) {
            System.out.println("Tam giac ABC la tam giac deu");
        }
        else if(Math.pow(canh1, 2)+Math.pow(canh2, 2)==Math.pow(canh3, 2) || Math.pow(canh1, 2)+Math.pow(canh3, 2)==Math.pow(canh2, 2) || Math.pow(canh2, 2)+Math.pow(canh3, 2)==Math.pow(canh1, 2) ){
            System.out.println("Tam giac ABC la tam giac vuong");
        }
        else if(canh1==canh2 || canh1==canh3 || canh2==canh3){
            System.out.println("Tam giac ABC la tam giac can");
        }
        else {
            System.out.println("Tam giac ABC la tam giac thuong(nhon hoac tu)");
        }
        System.out.println(h);
    }
    public void tinhDTTG(){
        double S;
        S = Math.sqrt(p * (p - this.canh1) + p * (p - this.canh2) + p * (p - this.canh3));
        System.out.println("Dien tich tam giac ABC = " + S);
    }
    public void tinhCVTG(){
        int C;
        C = canh1 + canh2 + canh3;
        System.out.println("Chu vi tam giac ABC = " + C);
    }
}

public class bai4 {
    public static void main(String[] args) {
        tamGiac tg = new tamGiac();
        tg.inPut();
        tg.xetLoaiTG();
        tg.tinhCVTG();
        tg.tinhDTTG();
    }
}
