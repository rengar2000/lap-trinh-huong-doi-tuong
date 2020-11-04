public class bai9 {
    public static void main(String[] args) {
        long [] arr = new long [100];
        arr[0]=1; 
        arr[1]=1;
        for (int i = 2; i < 100; i++)
        {
            arr[i] = arr[i-1]+arr[i-2];
            arr[i] = arr[i] % 1000000007;
        }
        for (int i = 0; i < 100; i++)
            System.out.print(arr[i]+" ");
    }
}
