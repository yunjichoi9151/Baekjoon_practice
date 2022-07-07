import java.util.Scanner;

public class Konpeito_22015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3], max = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println(max * 3 - (arr[0] + arr[1] + arr[2]));
    }
}
