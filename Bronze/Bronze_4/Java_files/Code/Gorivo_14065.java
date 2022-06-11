import java.util.Scanner;

public class Gorivo_14065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.printf("%.6f", 100 * 3.785411784 / (1.609344 * x));
    }
}
