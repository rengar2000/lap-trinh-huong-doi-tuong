import java.util.Arrays;
public class bai7 {
    public static void main(String[] args) {
        int array[] = new int[] {12, 21, 434, 543, 533, 687, 987, 756, 123, 764};
        System.out.print("mang chua sap xep: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(" ");
        System.out.println("mang da sap xep: "+ Arrays.toString(array));
    }
}
