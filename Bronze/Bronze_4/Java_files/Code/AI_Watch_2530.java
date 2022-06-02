import java.util.Scanner;

public class AI_Watch_2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println((a + (b + (c + d) / 60) / 60) % 24 + " " + (b + (c + d) / 60) % 60 + " " + (c + d) % 60);
    }
}
