import java.util.Scanner;

public class Chicken_Dance_25191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        System.out.println((n >= a / 2 + b) ? a / 2 + b : n);
        sc.close();
    }
}
