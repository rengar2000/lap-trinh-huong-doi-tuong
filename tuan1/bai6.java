
public class bai6 {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++)
        {
            long x;
            x =  (int) Math.pow(i, 2);
            System.out.println("binh phuong cua "+i+" = " + x);
            x = (int) Math.pow(i, 3);
            System.out.println("lap phuong cua "+i+" = " + x);
        }
    }
}
