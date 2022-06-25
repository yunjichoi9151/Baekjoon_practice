import java.util.Scanner;

public class Choice_Card_16204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        System.out.println((m >= k) ? k + n - m : m + n - k);
    }
}
