import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap so luong cua mang N = ");
        int n = x.nextInt();
        int arr[] = new int[n + 1];
        System.out.print("Nhap so muon ma hoa: ");
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }
        System.out.println("");
        System.out.println("Ky tu duoc ma hoa la: ");
        for (int i = 0; i < n; i++) {
            System.out.println((char) arr[i] + " - " + arr[i]);
        }
    }
}