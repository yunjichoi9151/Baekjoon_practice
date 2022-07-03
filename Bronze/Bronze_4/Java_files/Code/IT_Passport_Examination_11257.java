import java.util.Scanner;

public class IT_Passport_Examination_11257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), s = sc.nextInt(), m = sc.nextInt(), t = sc.nextInt();
            System.out.println(a + " " + (s + m + t) + " " + ((s + m + t >= 55 && s >= 35 * 0.3 && m >= 25 * 0.3 && t >= 40 * 0.3) ? "PASS" : "FAIL"));
        }
    }
}
