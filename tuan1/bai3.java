import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = x.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("a = ", i);
            arr[i] = x.nextInt();
        }
        max = arr[0];
        for (int i=0; i<n;i++)
        {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print("so lon nhat la: "+max);
    }
}
