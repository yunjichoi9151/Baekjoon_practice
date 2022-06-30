import java.util.Scanner;

public class Barn_Subscription_19698 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt(), l = sc.nextInt();
        System.out.println((n >= (w / l) * (h / l)) ? (w / l) * (h / l) : n);
    }
}
