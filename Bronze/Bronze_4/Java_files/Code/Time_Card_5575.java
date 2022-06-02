import java.util.Scanner;

public class Time_Card_5575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] H = new int[3];
        int[] M = new int[3];
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int s1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            int s2 = sc.nextInt();
            int t = h2 * 3600 + m2 * 60 + s2 - (h1 * 3600 + m1 * 60 + s1);
            H[i] = t / 3600 % 24;
            M[i] = t / 60 % 60;
            S[i] = t % 60;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(H[i] + " " + M[i] + " " + S[i]);
        }
    }
}
