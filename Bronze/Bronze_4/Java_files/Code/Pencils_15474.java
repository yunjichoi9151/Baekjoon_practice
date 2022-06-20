import java.util.Scanner;

public class Pencils_15474 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int k = n / a + (n % a != 0 ? 1 : 0);
		int m = n / c + (n % c != 0 ? 1 : 0);
        System.out.println(k * b > m * d ? m * d : k * b);
    }
}
