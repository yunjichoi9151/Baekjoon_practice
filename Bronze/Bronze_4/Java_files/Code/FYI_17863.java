import java.util.Scanner;

public class FYI_17863 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n / 1000000 == 5 && n / 100000 == 55 && n / 10000 == 555) ? "YES" : "NO");
    }
}
