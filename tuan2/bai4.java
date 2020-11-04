import java.util.*;
public class bai4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        HOCSINH[] dshs = new HOCSINH[20];
        int n=0;
        System.out.print("Nhap so luong hoc sinh: ");
        n = x.nextInt();
        for (int i = 0; i<n; i++)
        {
            dshs[i] = new HOCSINH();
            dshs[i].input();
        }
        System.out.println("Danh sach hoc sinh la: \n");
            for (int i=0; i < n; i++)
                dshs[i].output();
    }
}
