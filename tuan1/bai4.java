import java.util.*;
import java.math.*;
public class bai4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int n = x.nextInt();
        System.out.print("Nhap so cot: ");
        int m = x.nextInt();
        int [][] arr = new int [n][m];
        int i, j;
        for (i = 0; i<n; i++){
            for (j=0; j< m; j++){
                arr[i][j] = (int) (Math.random()*100);
            }
        }
        System.out.println("Xuat ma tran");
        show(arr);
        int tong = 0;
        for (i = 0; i<n; i++){
            for(j=0; j<m; j++){
                tong += arr[i][j];
            }
        }
        System.out.print("Tong cac phan tu mang: "+tong);
    }
    public static void show(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
