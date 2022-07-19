import java.util.Scanner;

public class Betting_24751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.printf("%.10f\n%.10f", 100 / a, 100 / (100 - a));
    }
}
