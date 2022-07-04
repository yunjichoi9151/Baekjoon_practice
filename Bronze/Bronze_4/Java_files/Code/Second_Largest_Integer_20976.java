import java.util.Scanner;
import java.util.Arrays;

public class Second_Largest_Integer_20976 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3], temp = 0;
        for (int i = 0; i < 3; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
