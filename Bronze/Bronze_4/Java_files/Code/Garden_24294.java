import java.util.Scanner;

public class Garden_24294 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w1 = sc.nextInt(), h1 = sc.nextInt(), w2 = sc.nextInt(), h2 = sc.nextInt();
        System.out.println((w1 > w2) ? 4 + 2 * w1 + 2 * (h1 + h2) : 4 + 2 * w2 + 2 * (h1 + h2));
    }
}
