import java.util.Scanner;

public class Silnia_8558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = 1;
        for (int i = 1; i < n + 1; i++)
            ans *= i;
        System.out.println(ans % 10);
    }
}
