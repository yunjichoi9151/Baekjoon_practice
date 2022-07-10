import java.util.Scanner;

public class Make_SASA_23825 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        System.out.println((n > m) ? m / 2 : n / 2);
    }
}
