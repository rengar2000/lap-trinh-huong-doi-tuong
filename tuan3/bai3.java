import java.io.*;
import java.util.*;

class COODINATE{
    int x, y;
    public COODINATE(){
        x = 0;
        y = 0;
    }
    public COODINATE(int x, int y){
        this.x = x;
        this.y = y;
    }
    public COODINATE(COODINATE a){
        this.x = a.x;
        this.x = a.y;
    }
    public int getX(){
        return x;
    }
    public void setX(int a){
        this.x = a;
    }
    public int getY(){
        return y;
    }
    public void setY(int b){
        this.y = b;
    }
    public COODINATE cong(COODINATE a){
        int X, Y;
	    X = this.x + a.x;
        Y = this.y + a.y;
        COODINATE diem = new COODINATE(X, Y);
        return diem;
    }
    public COODINATE doiXungQuaX(){
        int X, Y;
        X = this.x;
        Y = - this.y;
        COODINATE diem = new COODINATE(X, Y);
        return diem;
    }
    public COODINATE doiXungQuaY(){
        int X, Y;
        X = - this.x;
        Y = this.y;
        COODINATE diem = new COODINATE(X, Y);
        return diem;
    }
    public void outPut(){
        System.out.println("(" + this.x + ";" + this.y + ")");
    }
    public void show(){
        System.out.print("("+this.getX()+";"+this.getY()+")");
    }
}

public class bai3 {
    public static void main(String[] args) {
        int a = -7, b = 8;
        COODINATE diem1 = new COODINATE();
        diem1.outPut();;
        COODINATE diem2 = new COODINATE(a, b);    
        diem2.doiXungQuaY().show();
    }
}
