import java.util.Scanner;

public class Hard_Choice_15059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[4], arr2[] = new int[4], sum = 0;
        for (int i = 0; i < 3; i++)
            arr1[i] = sc.nextInt();
        for (int i = 0; i < 3; i++)
            arr2[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            if (arr1[i] < arr2[i])
                sum += arr2[i] - arr1[i];
        }
        System.out.println(sum);
    }
}
