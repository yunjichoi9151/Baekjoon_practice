import java.util.Scanner;

public class Rulltrappa_20867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble(), s = sc.nextDouble(), g = sc.nextDouble(), a = sc.nextDouble(), b = sc.nextDouble(), l = sc.nextDouble(), r = sc.nextDouble();
        System.out.println((m / g + l / a > m / s + r / b) ? "latmask" : "friskus");
    }
}
