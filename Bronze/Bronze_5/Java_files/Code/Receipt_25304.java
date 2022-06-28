import java.util.Scanner;

public class Receipt_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), n = sc.nextInt(), sum = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            sum += a * b;
        }
        System.out.println((sum == x) ? "Yes" : "No");
    }
}
