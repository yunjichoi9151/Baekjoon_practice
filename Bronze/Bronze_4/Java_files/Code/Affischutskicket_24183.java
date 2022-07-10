import java.util.Scanner;

public class Affischutskicket_24183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.printf("%.6f", (a * 2 * 0.229 * 0.324) + (b * 2 * 0.297 * 0.42) + (c * 0.21 * 0.297));
    }
}
