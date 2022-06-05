import java.util.Scanner;

public class Koszykarz_8710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        if ((w - k) % m == 0)
            System.out.println((w - k) / m);
        else
            System.out.println((w - k) / m + 1);
    }
}
