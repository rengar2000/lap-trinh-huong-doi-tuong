import java.util.Scanner;
public class bai10 {
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
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        int sum = 0;
        int k = (int) (Math.random() * n);

        for (j = 0; j < m; j++) {
            sum += arr[k][j];
        }
        System.out.println("Tong cac phan tu hang thu " + k + " ma tran la: " + sum);
    }
}
