import java.util.Scanner;
import java.lang.Math;

public class UkJe_17356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        double m = (b - a) / 400;
        System.out.println(1 / (1 + Math.pow(10, m)));
    }
}
